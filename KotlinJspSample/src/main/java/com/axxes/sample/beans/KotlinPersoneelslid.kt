class Personeelslid(voornaam: String, familienaam: String) : Persoon(voornaam, familienaam) {

    override fun toString() = "Personeelslid " + super.toString()

}