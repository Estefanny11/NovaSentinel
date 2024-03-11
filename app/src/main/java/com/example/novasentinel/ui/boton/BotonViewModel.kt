package com.example.novasentinel.ui.boton

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BotonViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is boton Fragment"
    }
    val text: LiveData<String> = _text
}