package classes

class Item() {
    var name: String = ""
    var price: Double = 0.0
        get() {
            println("Inside Getter")
            return field
        }
        set(value) {
            println("Inside Setter")
            if (value >= 0.0 ) {
                field = value
            } else {
                throw IllegalArgumentException("Value can't be negative")
            }
        }

    constructor(_name: String) : this() {
        name = _name
    }
}

fun main() {
    val item = Item("Iphone")
    println("Item: ${item.name}")
    item.name = "Iphone 16"
    println("Item: ${item.name}")
    item.price = -10.0
    println(item.price)

}