package com.example.bottomnavigationview

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bottomnavigationview.databinding.FragmentFirstBinding


class FirstFragment(private val title: String, private val iconRes: Int) : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//
      // Fragment içeriğini güncelleme
        binding.textView.text = title
        binding.fragmentIcon.setImageResource(iconRes)

        // Fragment renk özelleştirmeleri
        binding.firsttFragment.setBackgroundColor(requireContext().getColor(R.color.background_color)) //
        // Fragment seçildiğinde ve seçilmediğinde renk değiştirme
        val selectedColor = requireContext().getColor(R.color.selected_color)
        val unselectedColor = requireContext().getColor(R.color.unselected_color)

        binding.firsttFragment.setOnClickListener {
            // Fragment'a tıklanıldığında renk değişimi
            if (isSelected()) {
                binding.root.setBackgroundColor(unselectedColor)
            } else {
                binding.root.setBackgroundColor(selectedColor)
            }
        }
  }

    private fun isSelected(): Boolean {

        return false
    }
}