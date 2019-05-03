package com.axxes.sample.beans;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author pluts
 */
public class PersonTest {    
    @Test
    public void testConstructor() {
        Person person = new Person("Pieter", "Luts");
        assertEquals("Pieter", person.getFirstName());
        assertEquals("Luts", person.getLastName());
    }

    @Test
    public void testFirstNameSetter() {
        Person person = new Person();
        person.setFirstName("Pieter");
        assertEquals("Pieter", person.getFirstName());
    }
    
    @Test
    public void testLastNameSetter() {
        Person person = new Person();
        person.setLastName("Luts");
        assertEquals("Luts", person.getLastName());
    }
    
    @Test
    public void testToString() {
        Person person = new Person("Pieter", "Luts");
        assertEquals("Luts Pieter", person.toString());
    }
}
