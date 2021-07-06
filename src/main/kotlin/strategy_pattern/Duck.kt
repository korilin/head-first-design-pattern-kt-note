package strategy_pattern

abstract class Duck(private var quackBehavior: QuackBehavior, private var flyBehavior: FlyBehavior) {
    fun swim() {
        println("All ducks float, even decoys!")
    }

    abstract fun display()

    fun performQuack() {
        quackBehavior.quack()
    }

    fun performFly() {
        flyBehavior.fly()
    }

    fun setQuackBehavior(quackBehavior: QuackBehavior) {
        this.quackBehavior = quackBehavior
    }

    fun setFlyBehavior(flyBehavior: FlyBehavior) {
        this.flyBehavior = flyBehavior
    }
}