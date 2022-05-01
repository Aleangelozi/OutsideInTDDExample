package com.aleangelozi.outsideintddexample.unittests

import org.junit.Assert.assertEquals
import org.junit.Test

class CarShould {
    val car = Car(5.0)

    @Test
    fun looseFuelWhenItTurnsOn() {
        car.turnOn()

        assertEquals(4.5, car.fuel)
    }
}