package com.sr.rikcandmortycompose_actors.screen.actors.presentation.compose.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.sr.rickandmortycompose.theme.Theme
import com.sr.rickandmortycompose.view.CoilImage
import com.sr.rickandmortycompose_actors.R
import com.sr.rikcandmortycompose_actors.root.presentation.view.StatusActorView
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.model.ActorUiModel
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.viewmodel.model.ActorsEvent

@Composable
fun ActorsCardView(actor: ActorUiModel, eventHandler: (event: ActorsEvent) -> Unit) = Card(
    modifier = Modifier
        .fillMaxWidth()
        .clickable { eventHandler(ActorsEvent.OnClickActors(actor)) }
        .defaultMinSize(minHeight = 375.dp),
    shape = RoundedCornerShape(8.dp),
    colors = CardDefaults.cardColors(containerColor = Theme.colors.darkGray)
) {
    Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {

        CoilImage(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 8.dp)
                .clip(RoundedCornerShape(16.dp))
                .height(150.dp), url = actor.image
        )

        Text(
            text = actor.name, style = Theme.fonts.h3.copy(color = Theme.colors.text)
        )

        Spacer(modifier = Modifier.height(8.dp))
        StatusActorView(icon = actor.statusIconId, status = actor.status)
        Spacer(modifier = Modifier.height(4.dp))
        StatusActorView(icon = actor.genderIconId, status = actor.gender)
        Spacer(modifier = Modifier.height(4.dp))
        StatusActorView(icon = R.drawable.actors_ic_planet, status = actor.location)
    }
}