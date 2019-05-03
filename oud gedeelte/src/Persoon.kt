open class Persoon {
    var voornaam: String? = null
    var familienaam: String? = null



    constructor() {}

    constructor(voornaam: String, familienaam: String) {
        this.voornaam = voornaam
        this.familienaam = familienaam
    }

    override fun toString() =  familienaam?.toUpperCase() + " " + voornaam?.toLowerCase()

}