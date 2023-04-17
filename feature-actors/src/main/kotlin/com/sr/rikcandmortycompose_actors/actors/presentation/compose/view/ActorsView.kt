package com.sr.rikcandmortycompose_actors.actors.presentation.compose.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.sr.rikcandmortycompose_actors.root.domain.model.ActorDomainModel

@Composable
fun ActorsView(state: List<ActorDomainModel>) {

    LazyColumn( ){
        items(state.size){position->
            Text(text = state[position].name)
        }
    }

}