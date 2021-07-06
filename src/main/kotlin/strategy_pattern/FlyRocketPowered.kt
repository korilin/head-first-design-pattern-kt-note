package strategy_pattern

class FlyRocketPowered : FlyBehavior {
    override fun fly() {
        println("I'm flying with a rocket!")
    }
}