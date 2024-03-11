package com.example.novasentinel.ui.acoso

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AcosoViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is acoso Fragment"
    }
    val text: LiveData<String> = _text
}