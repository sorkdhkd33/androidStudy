package com.example.classstudy

class Operator2 {
    fun plus(vararg number:Int):Int{
        var result = 0
        number.forEach {
            result = result+it
        }
        return result
    }
    fun minus(vararg number:Int):Int{
        var result:Int = number[0]
        for(i in 0 until number.size) {
            if(i!=0){
                result -= number[i]
            }
        }
        return result
    }

    fun multi(vararg number:Int):Int{
        var result:Int = 1 //0으로 두면 안 된다.
        number.forEach {
            result = result*it
        }
        return result
    }

    fun divide(vararg number: Int): Int {
        var result: Int = number[0] //0으로 두면 안 된다.
        number.forEachIndexed { index, value ->
            if (index != 0 && value != 0) {
                result /= value
            }
        }
        return result
    }
}