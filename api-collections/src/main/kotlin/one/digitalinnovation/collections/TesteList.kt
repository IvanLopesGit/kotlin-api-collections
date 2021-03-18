package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 3000.0, "PJ")
    val pedro = Funcionario("Pedro", 1000.0, "CLT")
    val maria = Funcionario("Maria", 2000.0, "PJ")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it)}

    println("--------------------------")

    println(funcionarios.find { it.nome == "Maria" })

    println("--------------------------")

    funcionarios.sortedBy { it.salario }.forEach { println(it)}

    println("--------------------------")

    funcionarios.groupBy { it.contratacao }.forEach { println(it)}

}
