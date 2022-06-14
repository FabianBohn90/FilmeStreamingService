package com.syntax_institut.filmestreamingservice

/**
 * Diese Klasse liefert die Mediathek und enthält die Funktionalität zum Sortieren der Listen
 */
class Mediathek {

    /**
     * Diese Funktion liefert die Mediathek.
     * enthalten sind alle Filme
     */
    fun createDatabase(): MutableList<String> {

        // Eine Liste mit falschen Elementen
        val movieDatabase = mutableListOf(
            "How I Met Your Mother",
            "Sons Of Anarchy",
            "Bauer Sucht Frau"
        )

        // Leere die Liste
        // todo Schreibe hier deinen Code
        movieDatabase.clear()

        // Erstelle einige Variablen mit Filmtiteln
        // todo Schreibe hier deinen Code
        val film1 = "Interstellar"
        val film2 = "Gladiator"
        val film3 = "Gesetzt der Rache"
        val film4 = "Fight Club"
        val film5 = "Inception"
        val film6 = "Batman Begins"
        val film7 = "Batman"
        val film8 = "Die Verurteilten"
        val film9 = "Forrest Gump"
        val film10 = "Matrix"
        val film11 = "A Beautiful Mind"
        val film12 = "The Wolf of Wall Street"
        val film13 = "Der Hobbit: Eine Unerwartete Reise "
        val film14 = "Der Hobbit: Smaugs Einoede"
        val film15 = "der Hobbit: Die Schlacht der Fuenf Heere"
        val film16 = "Ace Ventura"
        val film17 = "Die Truman Show"
        val film18 = "Bruce Allmaechtig"
        val film19 = "Hancock"
        val film20 = "Sieben Leben"

        // Füge alle Filmtitel hinzu
        // todo Schreibe hier deinen Code
        movieDatabase.add(film1)
        movieDatabase.add(film2)
        movieDatabase.add(film3)
        movieDatabase.add(film4)
        movieDatabase.add(film5)
        movieDatabase.add(film6)
        movieDatabase.add(film7)
        movieDatabase.add(film8)
        movieDatabase.add(film9)
        movieDatabase.add(film10)
        movieDatabase.add(film11)
        movieDatabase.add(film12)
        movieDatabase.add(film13)
        movieDatabase.add(film14)
        movieDatabase.add(film15)
        movieDatabase.add(film16)
        movieDatabase.add(film17)
        movieDatabase.add(film18)
        movieDatabase.add(film19)
        movieDatabase.add(film20)

        // Mische die Elemente in der Liste
        // todo Schreibe hier deinen Code
        movieDatabase.shuffle()

        // Liefere alle Filme zurück
        return movieDatabase
    }

    /**
     * Diese Funktion sortiert die übergebende Liste alphabetisch
     */
    fun sortListAlphabetically(list: MutableList<String>): MutableList<String> {

        // sortiert die Liste alphabetisch
        // todo Schreibe hier deinen Code
        list.sort()

        // liefert die geänderte Liste zurück
        return list
    }

    /**
     * Diese Funktion sortiert die übergebene Liste nach Wortlänge
     */
    fun sortListTitleLength(list: MutableList<String>): MutableList<String> {

        // sortiert nach länge des Wortes
        // todo Schreibe hier deinen Code
        list.sortBy { it.length }

        // liefert die geänderte Liste zurück
        return list
    }

    /**
     * Diese Funktion invertiert die Reihenfolge der Liste
     */
    fun invertList(list: MutableList<String>): MutableList<String> {

        // invertiert die Reihenfolge
        // todo Schreibe hier deinen Code
        list.reverse()

        // liefert die geänderte Liste zurück
        return list
    }

    /**
     * Diese Funktion löscht den übergebenen Titel aus der Mediathek
     */
    fun deleteFromDatabase(database: MutableList<String>, title: String): MutableList<String> {

        // Entfehrnt den Titel aus der Mediathek
        // todo Schreibe hier deinen Code
        database.remove(title)

        // liefert die geänderte Liste zurück
        return database
    }

    /**
     * Diese Funktion fügt den übergebenen Titel an erster Stelle zu den Favoriten hinzu
     */
    fun addToFavorites(favorites: MutableList<String>, title: String): MutableList<String> {

        // fügt den Titel an erster Stelle in die Liste ein
        // todo Schreibe hier deinen Code
        favorites.add(0,title)

        // liefert die geänderte Liste zurück
        return favorites
    }
}
