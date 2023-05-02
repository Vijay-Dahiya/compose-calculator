package com.example.calculatorapp.common

sealed class CalculatorOperations(val symbol: String) {
     object Add : CalculatorOperations("+")
     object Subtract : CalculatorOperations("-")
     object Multiply  : CalculatorOperations("X")
     object Divide : CalculatorOperations("/")
}
