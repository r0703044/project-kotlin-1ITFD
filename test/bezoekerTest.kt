class BezoekerTest {



    /**
     * Test of constructor en getters
     */
    @Test
    fun testConstructorEnGetters() {

        val bezoeker = Bezoeker("Donald", "Duck")
        assertEquals("Donald", bezoeker.voornaam)
        assertEquals("Duck", bezoeker.familienaam)
        assertEquals(-1, bezoeker.pretparkcode)
    }

    /**
     * Test of setVoornaam method, of class Bezoeker.
     */
    @Test
    fun testSetVoornaam() {
        val bezoeker = Bezoeker("Donald", "Duck")
        bezoeker.voornaam = "Mickey"
        assertEquals("Mickey", bezoeker.voornaam)
    }

    /**
     * Test of setVoornaam method, of class Bezoeker.
     */
    @Test
    fun testSetFamilienaam() {
        val bezoeker = Bezoeker("Donald", "Duck")
        bezoeker.familienaam = "Mouse"
        assertEquals("Mouse", bezoeker.familienaam)
    }

    /**
     * Test of setVoornaam method, of class Bezoeker.
     */
    @Test
    fun testSetPretparkcode() {
        val bezoeker = Bezoeker("Donald", "Duck")
        bezoeker.pretparkcode = 11
        assertEquals(11, bezoeker.pretparkcode)
    }

    /**
     * check basic functionality of Visitor: constructor, setters/getters and
     * adding Attraction name to wishlist
     */
    @Test
    fun testWishlistBasics() {
        val v1 = Bezoeker("Donald", "Duck")
        assertEquals(0, v1.aantalOpWishlist)
        (v1.voegToeAanWishlist("Cobra"))
        assertEquals(1, v1.aantalOpWishlist)
    }

    /**
     * a Visitor can add maximum 5 Attraction names to wishlist
     */
    @Test
    fun testWishlistMax5() {
        val v1 = Bezoeker("Donald", "Duck")
        assertEquals(0, v1.aantalOpWishlist)
        (v1.voegToeAanWishlist("Cobra"))
        assertEquals(1, v1.aantalOpWishlist)
        (v1.voegToeAanWishlist("Cobre"))
        assertEquals(2, v1.aantalOpWishlist)
        (v1.voegToeAanWishlist("Cobri"))
        assertEquals(3, v1.aantalOpWishlist)
        (v1.voegToeAanWishlist("Cobro"))
        assertEquals(4, v1.aantalOpWishlist)
        (v1.voegToeAanWishlist("Cobru"))
        assertEquals(5, v1.aantalOpWishlist)
        (v1.voegToeAanWishlist("Pulsar"))
        assertEquals(5, v1.aantalOpWishlist)
    }

    /**
     * Test of toString method, of class Bezoeker.
     */
    @Test
    fun testToString() {
        val donald = Bezoeker("Donald", "Duck")
        donald.pretparkcode = 9
        assertEquals("Bezoeker DUCK donald met pretparkcode 9", donald.toString())
    }


}
