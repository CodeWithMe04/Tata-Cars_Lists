class CarsList{
    var model : String = "TATA V23RT"
    var price : Float = 2345.678F

    fun display(){
        println("The model is: $model")
        println("The price is: ${price+40+20}")
    }
}

fun main(args: Array<String>) {
    val tata = CarsList()
    tata.display()
}