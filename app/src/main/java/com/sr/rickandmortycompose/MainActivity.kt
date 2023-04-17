package com.sr.rickandmortycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.tooling.preview.Preview
import com.sr.rickandmortycompose.theme.RickAndMortyTheme
import com.sr.rickandmortycompose.theme.darkPalette
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.sr.rickandmortycompose.theme.Theme
import ru.alexgladkov.odyssey.compose.setup.OdysseyConfiguration
import ru.alexgladkov.odyssey.compose.setup.setNavigationContent
import ru.alexgladkov.odyssey.core.configuration.DisplayType

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initScreenFlow()
    }


    private fun initScreenFlow() =
        setContent {
            RickAndMortyTheme {
                val systemUiController = rememberSystemUiController()
                SideEffect {
                    systemUiController.setSystemBarsColor(
                        color = darkPalette.blackB,
                        darkIcons = false
                    )
                }

                val navigationConfiguration = OdysseyConfiguration(
                    canvas = this,
                    backgroundColor = Theme.colors.darkGray,
                    displayType = DisplayType.FullScreen
                )
                setNavigationContent(
                    configuration = navigationConfiguration
                ) {
                    generateGraph()
                }
            }
        }

}