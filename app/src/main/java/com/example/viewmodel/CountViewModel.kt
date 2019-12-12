package com.example.viewmodel

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel(){
    //Mutable mean can change
    private val _count = MutableLiveData<Int>()

    val count: LiveData<Int>
        get() = _count //this is a getter method

    fun increment()
    {
        _count.value = _count.value?.plus(1)
    }

    fun decrement()
    {
        _count.value = _count.value?.minus(1) //? mean null
    }

    init {
        _count.value = 0
        Log.d("MVVC", "ViewModel initialised")
    }



    override fun onCleared() {
        Log.d("MVVC", "ViewModel cleared")
        super.onCleared()
    }

}