package com.aqib.viewmodelpractice

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel(val initialValue: Int): ViewModel()  {

    var count: Int= initialValue

    fun increment(){
        count++
    }
    fun reset() {
        count= 0

    }


}