class Bezoeker(voornaam: String, familienaam: String) : Persoon(voornaam, familienaam) {
    val wishlist: ArrayList<String> = ArrayList()
    var pretparkcode: Int = 0

    val aantalOpWishlist: Int
        get() = wishlist.size

    init {
        this.pretparkcode = -1
    }

    fun voegToeAanWishlist(attractienaam: String): Boolean {
        if (wishlist.size < 5) {
            wishlist.add(attractienaam)
            return true
        } else {
            return false
        }
    }

    override fun toString() = "Bezoeker " + super.toString() + " met pretparkcode " + pretparkcode

}