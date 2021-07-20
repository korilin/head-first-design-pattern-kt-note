package observer_pattern.v1

class CurrentConditionsDisplay(private val weatherData: Subject) : Observer, DisplayElement {

    private var temperature = 0f
    private var humidity = 0f

    init {
        this.weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Current Conditions: $temperature F degrees and $humidity % humidity")
    }
}