package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}

    nomes[0] = "Maria"
    nomes[1] = "José"
    nomes[2] = "Carlos"

    for (nome in nomes) {
        println(nome)
    }

    println("------------------------------------------")

    nomes.sort()
    nomes.forEach {
        println(it)
    }

    val nomes2 = arrayOf("Ivan", "Pedro", "Alex")

    println("------------------------------------------")

    nomes2.sort()
    nomes2.forEach {
        println(it)
    }

}