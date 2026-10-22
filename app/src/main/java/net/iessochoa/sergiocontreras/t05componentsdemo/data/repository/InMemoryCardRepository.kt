package net.iessochoa.sergiocontreras.t05componentsdemo.data.repository

/**
 * Project: T05 Components Demo
 * From: net.iessochoa.sergiocontreras.t05componentsdemo.data.repository
 * Created by: Contr
 * On: 22/10/2026 at 14:14
 * Creado en Settings -> Editor -> File and Code Templates
 */

object InMemoryCardRepository {

    private val nombresCartas = listOf(
        "Beseech the Mirror",
        "Agatha's Soul Cauldron",
        "Hylda's Crown of Winter",
        "Cruel Somnophage",
        "Faunsbane Troll",
        "Agatha's Champion",
        "Gruff Triplets",
        "Virtue of Loyalty",
        "Virtue of Persistence",
        "Up the Beanstalk",
        "Stroke of Midnight",
        "Monstrous Rage",
        "Torch the Tower",
        "Frantic Firebolt",
        "Spell Stutter",
        "Johann's Stopgap",
        "Gumdrop Poisoner",
        "Mosswood Dreadknight",
        "Questing Druid",
        "Talion, the Kindly Lord",
    )

    // Esto cambiarlo a Flow cuando se explique
    fun getCardNames(): List<String> = nombresCartas
    fun getRandomCard(): String = nombresCartas.random()

}