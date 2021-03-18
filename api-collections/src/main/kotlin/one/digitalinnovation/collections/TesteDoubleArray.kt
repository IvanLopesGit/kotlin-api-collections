package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 10.3
    salarios[1] = 30.1
    salarios[2] = 60.8

    salarios.forEach { println(it) }

    println("-------------------------------------------")

    salarios.forEachIndexed {index, salario ->
        salarios[index] = salario + 500.00
        println(salarios[index])
    }

    println("-------------------------------------------")

    val salarios2 = doubleArrayOf(2000.50, 1200.10, 3000.10)

    salarios2.sort()
    salarios2.forEach { println(it) }
}