package strategy_pattern

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("<< Silence >>")
    }
}