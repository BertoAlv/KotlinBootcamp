
fun main() {

    // Pairs
    val pair = "fish net" to "catching fish"
    println("${pair.first} is used for ${pair.second}")
    val (tool, action) = pair
    println("You can use a $tool if what you want to do is $action")

    // Triples
    val triplete = Triple(2,4,7)
    println("${triplete.first} + ${triplete.second} is still less than ${triplete.third}")
    val (n1, n2, n3) = triplete
    println("$n1 $n3 $n2")

    // Lists
    val list = listOf(1,4,5,6,7,8,2,3)
    val reversed = list.reversed()
    val sublist = list.subList(3,6)
    val totalSum = list.sum()
    println(reversed)
    println(sublist)
    println(totalSum)

    val listOfStrings = listOf("ab","ccc","dd")
    val sumOfString = listOfStrings.sumOf { it.length }
    println(sumOfString)

    // Hash maps
    val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")
    println(cures.get("white spots"))
    println(cures["red sores"])
    println(cures.getOrDefault("bloating", "sorry, I don't know"))
    println(cures.getOrElse("bloating") {"No cure for this"})
    // Mutable map
    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    println(inventory.toString())
    inventory.remove("fish net")
    println(inventory.toString())

    // Extension Functions
    class AquariumPlant(val color: String, private val size: Int)

    fun AquariumPlant.isRed() = color == "red"    // OK
    //fun AquariumPlant.isBig() = size > 50         // gives error

}