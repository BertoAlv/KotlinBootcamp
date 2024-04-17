package example.myapp

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

class Shark() : FishAction, FishColor {
    override val color: String = "gray"
    override fun eat() {
        println("Hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor) : FishAction, FishColor by fishColor {
    override fun eat() {
        println("Eat algae")
    }
}

object GoldColor : FishColor {
    override val color = "gold"
}



