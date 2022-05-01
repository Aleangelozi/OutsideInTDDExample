package com.aleangelozi.outsideintddexample.acceptancetests

import org.junit.Assert.assertEquals
import org.junit.Test

class CarFeature {

    val car = Car(6.0)

    @Test
    fun carIsLoosingFuelWhenItTurnsOn() {

        car.turnOn()

        assertEquals(5.5, car.fuel)
    }
}