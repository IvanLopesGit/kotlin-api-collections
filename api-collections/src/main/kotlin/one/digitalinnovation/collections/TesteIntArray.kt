package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 6
    values[2] = 8
    values[3] = 9
    values[4] = 2

    for (valor in values) {
        println(valor)
    }

    values.forEach {
        println(it)
    }

    for (index in values.indices) {
        println(values[index])
    }

    values.sort()
    for (valor in values) {
        println(valor)
    }
}
