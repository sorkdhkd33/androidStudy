package com.example.classstudy

class Operator3(val initialValue: Int) {

    fun plus(number:Int):Operator3{
        val result = this.initialValue+number
        return Operator3(result)
    }
    fun minus(number:Int):Operator3{
        val result = this.initialValue-number
        return Operator3(result)
    }
    fun multi(number:Int):Operator3{
        val result = this.initialValue*number
        return Operator3(result)
    }
    fun divide(number:Int):Operator3{
        val result = this.initialValue/number
        return Operator3(result)
    }
}