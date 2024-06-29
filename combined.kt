fun main() {
    // BankAccount demonstration
    val account = BankAccount("123456789", 1000.0)
    account.deposit(200.0)
    account.withdraw(150.0)
    println("Current balance: ${account.getBalance()}")

    println("\n--- Shape Inheritance and Polymorphism ---")
    // Shape demonstration
    val shapes: List<Shape> = listOf(
        Rectangle(3.0, 4.0),
        Circle(5.0)
    )

    for (shape in shapes) {
        println("Area: ${shape.area()}")
        println("Perimeter: ${shape.perimeter()}")
    }

    println("\n--- Drawable Interface Implementation ---")
    // Drawable demonstration
    val drawableObjects: List<Drawable> = listOf(
        Square(4.0),
        Triangle(3.0, 5.0)
    )

    for (drawable in drawableObjects) {
        drawable.drawInfo()
    }
}
