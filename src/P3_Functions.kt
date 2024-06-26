import kotlin.random.Random


fun main() {

//    val temperature = 60
//    val isHot = "The water temperature is ${ if (temperature > 50) "too warm" else "OK"}."
//    println(isHot)
    feedTheFish()
    swim()
    swim("slow")
    swim(speed = "turtle-like")

    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    // eager, creates a new list
    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")
    // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")
    // force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: $newList")

//    val lazyMap = decorations.asSequence().map {
//        println("access: $it")
//        it
//    }
//    println("lazy: $lazyMap")
//    println("-----")
//    println("first: ${lazyMap.first()}")
//    println("-----")
//    println("all: ${lazyMap.toList()}")
//    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
//        println("access: $it")
//        it
//    }
//    println("-----")
//    println("filtered: ${lazyMap2.toList()}")

    var dirtyLevel = 20
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
//    val waterFilter = { dirty: Int -> dirty / 2}
    println(waterFilter(dirtyLevel))

    println(updateDirty(30, waterFilter))
    println(updateDirty(59, ::increaseDirty))
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water : ${shouldChangeWater(day)}")
}

fun randomDay() : String {
    val week = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random.nextInt(week.size)]
}

fun fishFood (day : String) : String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "flies"
        else -> "nothing"
    }
}

fun swim(speed : String = "50km/h"){
    println("Swimming speed is $speed")
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20) : Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun increaseDirty( start: Int ) = start + 1