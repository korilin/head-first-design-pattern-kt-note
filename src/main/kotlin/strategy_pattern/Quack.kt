package strategy_pattern

class Quack : QuackBehavior {
    override fun quack() {
        println("Quack")
    }
}