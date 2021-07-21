package observer_pattern.v2

import observer_pattern.v1.DisplayElement
import java.util.*

class CurrentConditionsDisplay(observable: Observable) : Observer, DisplayElement {

    private val observables = mutableListOf<Observable>()

    private var temperature = 0f
    private var humidity = 0f

    init {
        observables.add(observable)
        observable.addObserver(this)
    }

    override fun update(o: Observable?, arg: Any?) {
        if (o is WeatherData) {
            o.also {
                this.temperature = it.temperature
                this.humidity = it.humidity
            }
            display()
        }
    }

    override fun display() {
        println("Current conditions: $temperature F degrees and $humidity % humidity")
    }

    fun registerAll(){
        observables.forEach { observable ->
            observable.deleteObserver(this)
        }
    }
}