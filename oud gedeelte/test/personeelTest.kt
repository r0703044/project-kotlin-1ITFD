class PersoneelslidTest {



    /**
     * Test of constructor en getters
     */
    @Test
    fun testConstructorEnGetters() {

        val personeel = Personeelslid("Juul", "Kabas")
        assertEquals("Juul", personeel.voornaam)
        assertEquals("Kabas", personeel.familienaam)
    }


    /**
     * Test of toString method, of class Personeelslid.
     */
    @Test
    fun testToString() {
        val donald = Personeelslid("Donald", "Duck")
        assertEquals("Personeelslid DUCK donald", donald.toString())
    }



}
