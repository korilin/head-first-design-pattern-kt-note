package strategy_pattern

class MallardDuck : Duck(Quack(), FlyWithWings()) {
    override fun display() {
        println("I'm a real Mallard duck")
    }
}