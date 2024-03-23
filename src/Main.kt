//KOTLIN
//Average Calculation
//Write a Kotlin function named calculateAverage that takes a variable number of integers as parameters and returns their average.
// Print the result.
fun main(){

}
fun calculateAverage(num1:Int, num2:Int) {
    var avg = (num1 + num2) / 2
    println("$avg")
}
//In the above question I have created a function named
//calculateAverage that I've assigned two variables
// named num1 and num2 then I have find its average by
//adding the two variables and divided by the size of the
//arrays which is two.

//Prime Number Check
//Create a Kotlin function named isPrime that takes an
// integer as a parameter and returns true if it's a prime number and false otherwise.
// Print the result.

//fun main(){
isPrime(20)
}

fun isPrime(num:Int):Boolean{
    var num = 20%2
    if(num==0){
        println(true)
    }
    else{
        println(false)
    }
    return true
    println(num)
}
//In question 2 I have created a function called isPrime
//which checks the variables assigned to them whether its an
//prime number or not a prime number and returns true or false
//if the number is a prime number or not a prime number.
//Sum of Two Numbers:
//Write a Kotlin function named sum that takes two integers as parameters
// and returns their sum. Print the result.
fun main(){
    val num1=5
    val num2=10
}

fun sum (a:Int,b:Int):Int{
    return a+b
    println("result")
}
//On question 3 I have created a function named sum which
//checks for the sum of the two intergers assigned to it.

//Factorial Calculation
//Create a Kotlin function named calculateFactorial that takes a non-negative integer as a parameter and returns its factorial. The factorial of a number is the
// product of all positive integers up to that number.

fun main(){
  val number = 5
}

fun calculateFactorial(number:Int):Long{
    var factorial:Long=1
    for (i in 1..number){
        factorial *=i
    }
    return factorial
    println("The factorial of $number is: $factorial ")
}
//Question 4 I have created a function called calculateFactorial
//which finds the product of all positive integers.

//String Reversal
//Write a Kotlin function named reverseString that takes a string as a parameter and returns the reversed
// version of the string. Print the reversed string.

fun main(){
val reversedString = reverseString()
}

fun reverseString(input:String):String{
    return input.reversed()
    println("The reversed string is: ${reverseString()}String")
}
//In question 5 the function is called reverseString that
//returns the reversed version of the string and prints out the string.

//Power Function:
//Write a Kotlin function named power that takes two parameters, base and exponent, and returns the result of raising the base
// to the power of the exponent. Print the result.

fun main(){
    var  base = 2.0
    var exponent = 3.0

}

fun power(base:Double, exponent:Double):Double{
    return Math.pow()
    println("The result of $base raised to the power of $exponent")
}
//Question 6 The function is named power that takes in
//two param, which are base and exponent and the result
//that is being returned is raising the base to the power
//of the exponent and prints out the result.
