package com.kojotdev.android.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    private val _name = MutableLiveData<String>()
    val name: LiveData<String>
        get() = _name


    init {
        Log.d("home-viewmodel", "init home view model!")
        _name.value = "Anetka"
    }

    fun setName(name: String) {
        _name.value = name
    }

}