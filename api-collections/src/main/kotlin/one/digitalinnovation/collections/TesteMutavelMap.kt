package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 3000.0, "PJ")
    val pedro = Funcionario("Pedro", 1000.0, "CLT")
    val maria = Funcionario("Maria", 2000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))
}