package com.example.bottomnavigationview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bottomnavigationview.databinding.FragmentFirstBinding
import com.example.bottomnavigationview.databinding.FragmentSecondBinding


class SecondFragment(private val title: String, private val iconRes: Int) : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        // Fragment içeriğini güncelleme
        binding.textView2.text = title
        binding.fragmentIcon2.setImageResource(iconRes)

        // Fragment renk özelleştirmeleri
        binding.secondFragment.setBackgroundColor(requireContext().getColor(R.color.background_color))

        // Fragment seçildiğinde ve seçilmediğinde renk değiştirme
        val selectedColor = requireContext().getColor(R.color.selected_color)
        val unselectedColor = requireContext().getColor(R.color.unselected_color)

        binding.secondFragment.setOnClickListener {
            // Fragment'a tıklanıldığında renk değişimi
            if (isSelected()) {
                binding.root.setBackgroundColor(unselectedColor)
            } else {
                binding.root.setBackgroundColor(selectedColor)
            }
        }
        return binding.root
    }


    private fun isSelected(): Boolean {

        return false
    }
}