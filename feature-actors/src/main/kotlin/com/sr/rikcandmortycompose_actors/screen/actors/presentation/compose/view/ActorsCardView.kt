package com.sr.rikcandmortycompose_actors.screen.actors.presentation.compose.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sr.rickandmortycompose.theme.Theme
import com.sr.rickandmortycompose.view.CoilImage
import com.sr.rickandmortycompose_actors.R
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.model.ActorUiModel
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.viewmodel.model.ActorsEvent

@Composable
fun ActorsCardView(actors: ActorUiModel, eventHandler: (event: ActorsEvent) -> Unit) = Card(
    modifier = Modifier
        .fillMaxWidth()
        .clickable { eventHandler(ActorsEvent.OnClickActors(actors)) }
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
                .height(150.dp), url = actors.image
        )
        Text(
            text = actors.name, style = Theme.fonts.h3.copy(color = Theme.colors.text)
        )

        Spacer(modifier = Modifier.height(8.dp))

        StatusIconView(icon = R.drawable.actors_ic_pulse, status = actors.status)
        StatusIconView(icon = R.drawable.actors_ic_alien, status = actors.gender)
        StatusIconView(icon = R.drawable.actors_ic_planet, status = actors.location)

    }
}

@Composable
fun StatusIconView(icon: Int, status: String) =
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(painter = painterResource(icon), contentDescription = "")
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = status,
            style = Theme.fonts.h4.copy(color = Theme.colors.text)
        )
    }