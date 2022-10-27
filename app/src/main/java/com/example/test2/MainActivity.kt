package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun evaluateExpression(string: String, clear: Boolean) {
            if(clear) {
                resultsTv.text = ""
                workingsTv.append(string)
            } else {
                workingsTv.append(resultsTv.text)
                workingsTv.append(string)
                resultsTv.text = ""
            }
        }
        fun numberaction(view: View) {
            if(view is Button){
                workingsTv.append(view.text)
            }
        }
        fun equalaction(){}
        fun multiplyaction(){
            evaluateExpression("*", clear = true)
        }
        fun Delaction(view: View){
            val length=workingsTv.length()
            if(length>0)
                workingsTv.text =workingsTv.text.subSequence(0,length-1)
        }
        fun minusaction(){
            evaluateExpression("-", clear = true)
        }
        fun plusaction(){
            evaluateExpression("+", clear = true)
        }
        fun divideaction(){
            evaluateExpression("/", clear = true)
        }
        fun clearaction(view:View){
            workingsTv.text =""
            resultsTv.text =""
        }

    }
}