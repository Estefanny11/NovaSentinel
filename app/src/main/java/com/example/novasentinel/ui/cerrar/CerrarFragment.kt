package com.example.novasentinel.ui.cerrar

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.novasentinel.R
import com.example.novasentinel.ui.cerrar.CerrarViewModel
import com.example.novasentinel.databinding.FragmentCerrarBinding


class CerrarFragment : Fragment() {

    private var _binding: FragmentCerrarBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val cerrarBinding =
            ViewModelProvider(this).get(CerrarViewModel::class.java)

        _binding = FragmentCerrarBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}