package com.hakancivelek.functionalProgramming

class TwoNumberFunctions {
    static main(args) {
        TwoNumberFunctions functions = new TwoNumberFunctions()
        Closure add = { a, b -> a + b }
        def subtract = { a, b -> a - b }
        def multiply = { a, b -> a * b }
        def divide = { a, b -> b != 0 ? a / b : "Division by zero is not allowed" }
        def power  = { a, b -> a ** b }

        println "Addition (5 + 3): ${add(5, 3)}"
        println "Subtraction (5 - 3): " + {subtract(5, 3)}
        println "Multiplication (5 * 3): ${multiply(5, 3)}"
        println "Division (6 / 3): ${divide(6, 3)}"
        println "Division by Zero (5 / 0): ${divide(5, 0)}"
        println "Power (2^3): ${power(2, 3)}"
    }
}
