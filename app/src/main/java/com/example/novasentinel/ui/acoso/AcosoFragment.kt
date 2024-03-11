package com.example.novasentinel.ui.acoso

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.novasentinel.R
import com.example.novasentinel.databinding.FragmentAcosoBinding


class AcosoFragment : Fragment() {

    private var _binding: FragmentAcosoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val acosoBinding =
            ViewModelProvider(this).get(AcosoViewModel::class.java)

        _binding = FragmentAcosoBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}