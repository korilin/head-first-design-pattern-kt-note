package strategy_pattern

class ModelDuck : Duck(Quack(), FlyNoWay()) {
    override fun display() {
        println("I'm a model duck")
    }
}