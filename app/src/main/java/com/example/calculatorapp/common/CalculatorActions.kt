package com.example.calculatorapp.common

sealed class CalculatorActions {
     data class Number(val number: Int) : CalculatorActions()
    object Clear : CalculatorActions()
    object Delete : CalculatorActions()
     object Calculate : CalculatorActions()
     object Decimal : CalculatorActions()
    data class Operations(val operations: CalculatorOperations) : CalculatorActions()
}
