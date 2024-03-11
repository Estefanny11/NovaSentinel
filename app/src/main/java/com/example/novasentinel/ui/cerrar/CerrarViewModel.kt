package com.example.novasentinel.ui.cerrar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CerrarViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is cerrar Fragment"
    }
    val text: LiveData<String> = _text
}