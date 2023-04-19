package com.sr.rikcandmortycompose_actors.root.presentation.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sr.rickandmortycompose.theme.Theme

@Composable
fun StatusActorView(icon: Int, status: String) =
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(modifier=Modifier.size(20.dp),
            painter = painterResource(icon), contentDescription = "")
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = status,
            style = Theme.fonts.h4.copy(color = Theme.colors.text)
        )
    }