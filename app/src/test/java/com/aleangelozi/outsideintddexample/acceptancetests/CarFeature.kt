package com.aleangelozi.outsideintddexample.acceptancetests

import com.aleangelozi.outsideintddexample.Car
import com.aleangelozi.outsideintddexample.Engine
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

//In the acceptance test we don't mock anything
class CarFeature {
    private val DELTA = 1e-15
    private val engine = Engine()
    private val car = Car(6.0, engine)


    @Test
    fun carIsLoosingFuelWhenItTurnsOn() {

        car.turnOn()

        assertEquals(5.5, car.fuel, DELTA)

    }

    @Test
    fun carIsTurningOnItsEngineAndIncreasesTheTemperature() {
        car.turnOn()

        assertEquals(95, car.engine.temperature)
        assertTrue(car.engine.isTurnedOn)
    }
}