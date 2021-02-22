fun main(){
    var number1: Double = 10.0
    var number2: Double = 2.0
    val resulrado = calc(number1, number2, :: multiplicarTodos)
    print(resulrado)
}
fun calc(valor1: Double, valor2: Double, operacao:(Double, Double) -> Double):Double{
    val resultado = operacao(valor1, valor2)
    return resultado
}
fun somarTodos(num1:Double, num2:Double) = num1 + num2
fun multiplicarTodos(num1: Double, num2: Double) = num1 * num2
fun dividirTodos(num1: Double, num2: Double) = num1 / num2
fun subtrairTodos(num1: Double, num2: Double) = num1 - num2

