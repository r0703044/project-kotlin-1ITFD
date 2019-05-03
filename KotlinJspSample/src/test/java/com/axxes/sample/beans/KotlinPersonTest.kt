package com.axxes.sample.beans

import org.junit.Test;
import org.junit.Assert.assertEquals;

/**
 *
 * @author pluts
 */
class KotlinPersonTest {
    val person = KotlinPerson("Pieter", "Luts");
    
    @Test
    fun testConstructor() {
        assertEquals("Pieter", person.firstName);
        assertEquals("Luts", person.lastName);
    }
    
    @Test
    fun testToString() {
        assertEquals("Luts Pieter", person.toString());
    }
}
