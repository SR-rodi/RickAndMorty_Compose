package com.sr.rikcandmortycompose_actors.screen.detail.presentation.compose.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.sr.rickandmortycompose.theme.Theme
import com.sr.rickandmortycompose.view.CoilImage
import com.sr.rickandmortycompose_actors.R
import com.sr.rikcandmortycompose_actors.root.presentation.view.StatusActorView
import com.sr.rikcandmortycompose_actors.screen.detail.presentation.viewmodel.DetailActorEvent
import com.sr.rikcandmortycompose_actors.screen.detail.presentation.viewmodel.DetailActorState

@Composable
fun DetailActorView(state: DetailActorState, eventHandler: (DetailActorEvent) -> Unit) {

    val actor = state.actor
    if (actor != null)

        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            CoilImage(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .clip(RoundedCornerShape(16.dp)),
                url = actor.image,
                contentScale = ContentScale.Fit
            )

            Text(text = state.actor.name, style = Theme.fonts.h2.copy(color = Theme.colors.text))
            Spacer(modifier = Modifier.height(16.dp))

            StatusActorView(icon = actor.statusIconId, status = actor.status)
            Spacer(modifier = Modifier.height(8.dp))
            StatusActorView(icon = actor.genderIconId, status = actor.gender)
            Spacer(modifier = Modifier.height(8.dp))

            Row(modifier = Modifier.fillMaxWidth()) {
                InfoActorCard(
                    modifier = Modifier.weight(1f),
                    planet = actor.originName,
                )
                Spacer(modifier = Modifier.width(8.dp))
                InfoActorCard(
                    modifier = Modifier.weight(1f),
                    planet = actor.location,
                    iconId = R.drawable.actors_ic_location,
                    titleID = R.string.actors_location
                )
            }
        }
}

@Composable
fun InfoActorCard(
    modifier: Modifier = Modifier,
    planet: String,
    iconId: Int = R.drawable.actors_ic_planet,
    titleID: Int = R.string.actors_planet,
) = Box(
    modifier = Modifier
        .fillMaxWidth()
        .then(modifier),
    contentAlignment = Alignment.TopCenter
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 25.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Theme.colors.darkGray)
            .padding(horizontal = 8.dp, vertical = 15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = titleID),
            style = Theme.fonts.h2.copy(color = Theme.colors.text)
        )
        Text(text = planet, style = Theme.fonts.h4.copy(color = Theme.colors.blueA))
    }
    Image(
        modifier = Modifier.size(45.dp),
        painter = painterResource(id = iconId),
        contentDescription = ""
    )
}

