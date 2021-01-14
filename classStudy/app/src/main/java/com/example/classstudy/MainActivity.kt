package com.example.classstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val operator:Operator= Operator()
        Log.d("더하기","" + operator.plus(4,5))
        Log.d("빼기","" + operator.minus(4,5))
        Log.d("곱하기","" + operator.multi(4,5))
        Log.d("나누기","" + operator.divi(4,5))

        val operator2:Operator2= Operator2()
        Log.d("더하기","" + operator2.plus(1,2,3,4,5))
        Log.d("빼기","" + operator2.minus(10,2,3,4))
        Log.d("곱하기","" + operator2.multi(1,2,3,4))
        Log.d("나누기","" + operator2.divide(10,2,3))


        val operator3:Operator3= Operator3(3)
        Log.d("더하고 빼기","" + operator3.plus(5).minus(3))
    }
}