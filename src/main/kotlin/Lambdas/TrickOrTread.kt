package Lambdas

class TrickOrTread {
}
fun main() {
    val coins: (Int) -> String = {
        "$it quarters"
    }
    val cupcake: (Int) -> String = { quantity ->
        "Have $quantity cupcakes!"
    }
    val treatFunction = trickOrTreat(false, { "$it quarters" })
    val trickFunction = trickOrTreat(true, cupcake)
    treatFunction()
    trickFunction()
}
fun trickOrTreat(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    if (isTrick) {
        println(extraTreat(2))
        return trick
    } else {
        println(extraTreat(5))
        return treat
    }
}
val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}
