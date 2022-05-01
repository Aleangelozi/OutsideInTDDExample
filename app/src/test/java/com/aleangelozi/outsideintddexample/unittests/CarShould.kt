package com.aleangelozi.outsideintddexample.unittests

import com.aleangelozi.outsideintddexample.Car
import org.junit.Assert.assertEquals
import org.junit.Test

class CarShould {
    private val DELTA = 1e-15
    private val car = Car(5.0)

    @Test
    fun looseFuelWhenItTurnsOn() {
        car.turnOn()

        assertEquals(4.5, car.fuel, DELTA)
    }
}