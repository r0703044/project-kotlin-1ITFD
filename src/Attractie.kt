class Attractie {
    var naam: String? = null
    var duur: Long = 0
    var foto: String? = null
    var verantwoordelijke: Personeelslid? = null

    constructor() {}

    constructor(naam: String) {
        this.naam = naam
    }

    constructor(naam: String, duur: Long) {
        this.naam = naam
        this.duur = duur
    }
}