package observer_pattern.v2

import java.util.*

class WeatherData : Observable() {
    var temperature = 0f
        private set
    var humidity = 0f
        private set
    var pressure = 0f
        private set

    private fun measurementsChanged() {
        setChanged()
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}