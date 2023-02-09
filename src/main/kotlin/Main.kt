fun main(args: Array<String>) {
    println("This Where our love story started!")
/*ANDVANCE CONTROL FLOW,RANGES*/
    val range = 0..10
    val x = 5
    if (x in range){
        println("$x is in the range")
    }
    /*Using 'in' operator*/
    for (i in range){
        println(i)
    }
    /*extra operators such as 'step','contains','first','last','reversed'*/
    for (i in range.step(2)){
        //will print even numbers
        println(i)
    }
println("10x10 table")

    /*Creating a 10x10 table*/
    for (i in 0..10){
        for (j in 0..10){
            print("${i * j}\t") // t for tab character,separate values
        }
        println() //insert newline character
    }

    println("Calculate the sum of all cell excluding even")
    var sum = 0
    for (i in 0 until 10){
        if (i % 2 == 0){
            continue
        }
        for(j in 0 until 10){
            sum += i * j
        }
    }

    println("'When' expression,the alternative to 'switch' statement")
    val y = 5
    when(x){
        1 -> println("Y is 1")
        2 -> println("Y is 2")
        3,4 -> println("Y is 3 or 4")
        else -> println("Y is neither 1,2,3 nor 4")
    }

    println("using when expression as an expression and assign its result to a variable")

    val m = 5
    val result = when(m){
        1 -> "m is 1"
        2 -> "m is 2"
        else -> "m is neither 1 nor 2"
    }
    println(result)

    println("Advance 'when' Expression")

    val hourOfDay=19
    var timeOfDay: String = when(hourOfDay) {
        0,1,2,3,4,5 -> "Early in the morning"
        6,7,8,9,10,11 -> "Morning"
        12,13,14,15,16 -> "Afternoon"
        17,18,19 -> "Evening"
        20,21,22,23 -> "Late Evening"
        else -> "INVALID ERROR!!!"
    }
    println(timeOfDay)

    println("using when with ranges")
    timeOfDay=when(hourOfDay){
        in 0..5 -> "Early in the morning"
        in 6..11 -> "Morning"
        in 12 .. 16 -> "Afternoon"
        in 17 ..19 -> "Evening"
        in 20 .. 23 -> "Late Evening"
        else -> "INVALID HOUR!!!"
    }
    println(timeOfDay)
    println("____________________________________________________________________________")
    println("FUNCTIONS IN KOTLIN")
    var results = sum(5,9)
    println(results)
    incrementAndPrint(9)
}

fun sum(a: Int, b: Int) : Int {
    return a + b
}

//Functions cannot alter their parameter but you can do indirectly
fun incrementAndPrint(value: Int): Int {
    val newValue = value + 1
    println(newValue)
    return newValue
}
