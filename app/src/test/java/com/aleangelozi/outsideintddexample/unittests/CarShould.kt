package com.aleangelozi.outsideintddexample.unittests

import com.aleangelozi.outsideintddexample.Car
import com.aleangelozi.outsideintddexample.Engine
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class CarShould {
    private val DELTA = 1e-15
    private val engine: Engine = mock()
    private val car = Car(5.0, engine)

    @Test
    fun looseFuelWhenItTurnsOn() {
        car.turnOn()

        assertEquals(4.5, car.fuel, DELTA)
    }

    @Test
    fun turnOnItsEngine() {
        car.turnOn()

        verify(engine, times(1)).turnOn()
    }
}