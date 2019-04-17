package i_introduction._0_Hello_World

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test



class PersoonTest {




    /**
     * Test of constructor en getters
     */
    @Test
    fun testConstructorEnGetters() {

        val leonie = Persoon("Leonie", "Pelgroms")
        assertEquals("Leonie", leonie.voornaam)
        assertEquals("Pelgroms", leonie.familienaam)
        val persoon = Persoon()
    }

    /**
     * Test of setVoornaam method, of class Persoon.
     */
    @Test
    fun testSetVoornaam() {
        val persoon = Persoon()
        persoon.voornaam = "Frans"
        assertEquals("Frans", persoon.voornaam)
    }

    /**
     * Test of setVoornaam method, of class Persoon.
     */
    @Test
    fun testSetFamilienaam() {
        val persoon = Persoon()
        persoon.familienaam = "Caers"
        assertEquals("Caers", persoon.familienaam)
    }

    /**
     * Test of toString method, of class Persoon.
     */
    @Test
    fun testToString() {
        val leonie = Persoon("Leonie", "Pelgroms")
        assertEquals("PELGROMS leonie", leonie.toString())
        val frans = Persoon("Frans", "Caers")
        assertEquals("CAERS frans", frans.toString())
    }



}