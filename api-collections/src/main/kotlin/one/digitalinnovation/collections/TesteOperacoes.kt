package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.00, 3000.40, 2000.21)

    for (salario in salarios) {
        println(salario)
    }

    println("------------------------")

    println("Maior Salário: ${salarios.maxOrNull()}")
    println("Menor Salário: ${salarios.minOrNull()}")
    println("Média Salário: ${salarios.average()}")

    println("------------------------")

    val salariosFilter = salarios.filter { it > 2500 }
    salariosFilter.forEach { println(it) }

    println("------------------------")

    println(salarios.count { it in 2000.0..5000.0 })

    println("------------------------")

    println(salarios.find { it == 3000.4 })

    println("------------------------")

    println(salarios.any { it == 3000.4 })
}