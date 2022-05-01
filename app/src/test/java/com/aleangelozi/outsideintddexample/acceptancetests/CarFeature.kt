package com.aleangelozi.outsideintddexample.acceptancetests

import com.aleangelozi.outsideintddexample.Car
import org.junit.Assert.assertEquals
import org.junit.Test

class CarFeature {
    private val DELTA = 1e-15
    private val car = Car(6.0)

    @Test
    fun carIsLoosingFuelWhenItTurnsOn() {

        car.turnOn()

        assertEquals(5.5, car.fuel, DELTA)

    }
}