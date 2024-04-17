package example.myapp

fun main() {
    buildAquarium()
}

fun buildAquarium() {

//    val myAquarium = Aquarium()
//    myAquarium.printSize()
//    val aquarium2 = Aquarium(width = 10, height = 10)
//    aquarium2.printSize()
//    val aquarium3 = Aquarium(length = 200)
//    aquarium3.printSize()

//    val aquarium4 = Aquarium(numberOfFish = 29)
//    aquarium4.printSize()
//    aquarium4.volume = 80
//    aquarium4.printSize()
//
//    val tank = TowerTank(diameter = 25, height = 40)
//    tank.printSize()

    makeFish()
}

fun makeFish(): Unit {
    val shark = Shark()
    val plecostomus = Plecostomus()

    println("Shark color: ${shark.color}")
    shark.eat()
    println("Plecostomus color: ${plecostomus.color}")
    plecostomus.eat()
}