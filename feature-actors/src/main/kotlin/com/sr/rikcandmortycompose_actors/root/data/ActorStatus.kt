package com.sr.rikcandmortycompose_actors.root.data

import com.sr.rickandmortycompose_actors.R

enum class ActorStatus(val status: String) {
    ALIVE("Alive"), DEAD("Dead"), UNKNOWN("unknown");

    companion object {
        fun getStatusIcon(actorStatus: String): Int = when (actorStatus) {
            ALIVE.status -> R.drawable.actors_status_alive
            DEAD.status -> R.drawable.actors_status_dead
            else -> R.drawable.actors_status_unknown
        }
    }
}