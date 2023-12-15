package com.example.bottomnavigationview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bottomnavigationview.databinding.FragmentFirstBinding
import com.example.bottomnavigationview.databinding.FragmentThirdBinding


class ThirdFragment(private val title: String, private val iconRes: Int) : Fragment() {

    private lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater, container, false)

        binding.textView3.text = title
        binding.fragmentIcon3.setImageResource(iconRes)

        // Fragment renk özelleştirmeleri
        binding.thirdFragment.setBackgroundColor(requireContext().getColor(R.color.background_color))

        // Fragment seçildiğinde ve seçilmediğinde renk değiştirme
        val selectedColor = requireContext().getColor(R.color.selected_color)
        val unselectedColor = requireContext().getColor(R.color.unselected_color)

        binding.thirdFragment.setOnClickListener {
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