package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Button1.setOnClickListener {
            evaluateExpression("1", clear = true)
        }
        Button2.setOnClickListener {
            evaluateExpression("2", clear = true)
        }
        Button3.setOnClickListener {
            evaluateExpression("3", clear = true)
        }
        Button4.setOnClickListener {
            evaluateExpression("4", clear = true)
        }
        Button5.setOnClickListener {
            evaluateExpression("5", clear = true)
        }
        Button6.setOnClickListener {
            evaluateExpression("6", clear = true)
        }
        Button7.setOnClickListener {
            evaluateExpression("7", clear = true)
        }
        Button8.setOnClickListener {
            evaluateExpression("8", clear = true)
        }
        Button9.setOnClickListener {
            evaluateExpression("9", clear = true)
        }


    }
    fun plusaction(clickedView: View) {
        evaluateExpression("+", clear = true)
    }

    fun equalaction(clickedView: View) {}
    fun cleaAction(clickedView: View) {
        workingsTv.text =""
        resultsTv.text =""
    }
    fun divideAction(View: View) {
        evaluateExpression("/", clear = true)
    }
    fun multiplyAction(clickedView: View) {
        evaluateExpression("*", clear = true)
    }
    fun minusAction(clickedView: View) {
        evaluateExpression("-", clear = true)
    }
    fun delAction(clickedView: View) {
        val length=workingsTv.length()
        if(length>0)
            workingsTv.text =workingsTv.text.subSequence(0,length-1)
    }
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

}