package strategy_pattern

class FlyNoWay : FlyBehavior{
    override fun fly() {
        println("I can't fly")
    }
}