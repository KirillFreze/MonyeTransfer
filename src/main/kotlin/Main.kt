fun main(args: Array<String>) {

    val amount: Int = 6000
    var comission: Int = amount * 75 / 10000
    if (comission <= 35) comission = 35

    println("Косиссия составит: $comission рублей")


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

}