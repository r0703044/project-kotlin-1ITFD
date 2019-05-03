class AttractieTest {


    /**
     * Test of constructor en getters
     */
    @Test
    fun testConstructorEnGetters() {
        val cobra = Attractie("Cobra", 45)
        assertEquals("Cobra", cobra.naam)
        assertEquals(45, cobra.duur)
        val speedy = Attractie("Speedy")
        assertEquals("Speedy", speedy.naam)
        assertEquals(0, speedy.duur)
    }

    /**
     * Test of setNaam method, of class Attractie.
     */
    @Test
    fun testSetNaam() {
        val python = Attractie("Slang", 30)
        python.naam = ("Python")
        assertEquals("Python", python.naam)
    }

    /**
     * Test of setFotomethod, of class Attractie.
     */
    @Test
    fun testSetFoto() {
        val python = Attractie("Slang", 30)
        python.foto =("Python.jpg")
        assertEquals("Python.jpg", python.foto)
    }


    /**
     * Test of setDuur method, of class Attractie.
     */
    @Test
    fun testSetDuur() {
        val python = Attractie("Slang", 30)
        python.duur = (55)
        assertEquals(55, python.duur)
    }

    /**
     * Test of setVerantwoordelijke method, of class Attractie.
     */
    @Test
    fun testVerantwoordelijke() {
        val python = Attractie("Slang", 30)
        val Mickey = Personeelslid("Mickey", "Mouse")
        python.verantwoordelijke = (Mickey)
        assertEquals(Mickey, python.verantwoordelijke)
    }




}