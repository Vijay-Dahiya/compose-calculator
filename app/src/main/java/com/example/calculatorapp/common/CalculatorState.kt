package com.example.calculatorapp.common

data class CalculatorState(
    val number1 : String="",
    val number2 : String="",
    val operation : CalculatorOperations? = null
)