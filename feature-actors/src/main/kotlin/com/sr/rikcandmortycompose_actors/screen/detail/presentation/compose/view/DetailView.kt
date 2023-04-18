package com.sr.rikcandmortycompose_actors.screen.detail.presentation.compose.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import com.sr.rickandmortycompose.theme.Theme
import com.sr.rikcandmortycompose_actors.screen.detail.presentation.viewmodel.DetailActorEvent
import com.sr.rikcandmortycompose_actors.screen.detail.presentation.viewmodel.DetailActorState

@Composable
fun DetailActorView(state: DetailActorState, eventHandler: (DetailActorEvent) -> Unit) {

    Text(text = state.actor?.name ?: "", style = Theme.fonts.h2.copy(color = Theme.colors.text))
}