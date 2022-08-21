package com.mba.bullfin.ui.academia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.mba.bullfin.Poput
import com.mba.bullfin.databinding.FragmentAcademiaBinding
import  com.mba.bullfin.utilities.Variables

class AcademiaFragment : Fragment() {

    private var _binding: FragmentAcademiaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val academiaViewModel =
            ViewModelProvider(this).get(AcademiaViewModel::class.java)

        _binding = FragmentAcademiaBinding.inflate(inflater, container, false)



        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}