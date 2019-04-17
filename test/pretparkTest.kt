class PretparkTest {


    /**
     * Test of constructor en getters
     */
    @Test
    fun testConstructorEnGetters() {
        val plopsaland = Pretpark("Plopsaland")
        assertEquals("Plopsaland", plopsaland.naam)
    }

    /**
     * Test of setNaam method, of class Pretpark.
     */
    @Test
    fun testSetNaam() {
        val walibi = Pretpark("Walibi")
        walibi.naam ="Walibi"
        assertEquals("Walibi", walibi.naam)
    }

    /**
     * check constructor of LeisurePark + adding of Attractions check if you can
     * find an attraction by name
     */
    @Test
    fun checkToevoegenAttractiesEnOphalenAantal() {
        val walibi = Pretpark("Walibi")
        assertEquals(0, walibi.aantalAttracties)
        val cobra = Attractie("Cobra", 45)
        walibi.voegAttractieToe(cobra)
        assertEquals(1, walibi.aantalAttracties)
        val pulsar = Attractie("Pulsar", 30)
        walibi.voegAttractieToe(pulsar)
        assertEquals(2, walibi.aantalAttracties)
        val lijst = arrayOfNulls<Attractie>(2)
        lijst[0] = cobra
        lijst[1] = pulsar
        assertArrayEquals(lijst, walibi.attracties.toArray())
    }


    /**
     * Test of constructor en getters
     */
    @Test
    fun testZoekAttractieOpNaam() {
        val walibi = Pretpark("Walibi")
        assertEquals(0, walibi.aantalAttracties)
        val cobra = Attractie("Cobra", 45)
        walibi.voegAttractieToe(cobra)
        assertEquals(1, walibi.aantalAttracties)
        val pulsar = Attractie("Pulsar", 30)
        walibi.voegAttractieToe(pulsar)
        assertEquals(2, walibi.aantalAttracties)
        (walibi.zoekAttractieOpNaam("Pulsar"))
        assertEquals(pulsar.naam, walibi.zoekAttractieOpNaam("Pulsar")?.naam)
        (walibi.zoekAttractieOpNaam("blabla"))
    }

    /**
     * before a Visitor can make his reservations, he has to register to the
     * LeisurePark as result of this registration he will receive a LeisurePark
     * Id (simply the how maniest visitor he is)
     */
    @Test
    fun testRegistreerBezoeker() {
        val v1 = Bezoeker("Donald", "Duck")
        val walibi = Pretpark("Walibi")
        walibi.registreerBezoeker(v1)
        assertEquals(1, v1.pretparkcode)
        val v2 = Bezoeker("Mickey", "Mouse")
        walibi.registreerBezoeker(v2)
        assertEquals(2, v2.pretparkcode)
    }

}
