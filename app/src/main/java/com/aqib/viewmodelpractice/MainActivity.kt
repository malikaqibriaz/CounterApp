package com.aqib.viewmodelpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.view.View
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView= findViewById(R.id.textViewCount)
        //to start with some number. i.e: 10, 35, 66...  MainViewModelFactory(10)  MainViewModelFactory(35)  MainViewModelFactory(66)
        mainViewModel= ViewModelProvider(this, MainViewModelFactory(10)).get(MainViewModel::class.java)
        showResult()
    }

    private fun showResult() {

       textView.text= mainViewModel.count.toString()
       Log.d("TAGGG showResult",mainViewModel.count.toString())
    }

    fun increment(view: View) {
        mainViewModel.increment()
        showResult()

    }

    fun reset(view: View) {
        mainViewModel.reset()
        textView.text= "0"
        Log.d("TAGGG reset",mainViewModel.count.toString())

    }
}