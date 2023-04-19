package com.sr.rikcandmortycompose_actors.root.data

import com.sr.rickandmortycompose_actors.R

enum class ActorGender(val gender: String) {
    MALE("Male"),
    FEMALE("Female"),
    UNKNOWN("unknown"),
    GENDERLESS("Genderless");

    companion object {
        fun getGenderIcon(actorStatus: String): Int = when (actorStatus) {
            MALE.gender -> R.drawable.actors_gender_male
            FEMALE.gender -> R.drawable.actors_gender_female
            GENDERLESS.gender -> R.drawable.actors_gender_genderless
            else -> R.drawable.actors_status_unknown
        }
    }
}