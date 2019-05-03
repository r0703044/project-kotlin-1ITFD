class Pretpark(var naam: String?) {
    private var aantalBezoekers: Int = 0
    val attracties: ArrayList<Attractie> = ArrayList()

    val aantalAttracties: Int
        get() = attracties.size

    fun voegAttractieToe(attractie: Attractie) {
        attracties.add(attractie)
    }

    fun zoekAttractieOpNaam(naam: String): Attractie? {
        if (attracties.isEmpty()) {
            return null
        }
        val attracties = this.attracties
        for (a in attracties) {
            if (a.naam.equals(naam)) {
                return a
            }
        }
        return null
    }

    fun registreerBezoeker(bezoeker: Bezoeker) {
        aantalBezoekers += 1
        bezoeker.pretparkcode
        bezoeker.pretparkcode =aantalBezoekers

    }
}