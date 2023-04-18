package com.sr.rickandmortycompose.root

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.SideEffect
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.sr.rickandmortycompose.generateGraph
import com.sr.rickandmortycompose.theme.RickAndMortyTheme
import com.sr.rickandmortycompose.theme.Theme
import com.sr.rickandmortycompose.theme.darkPalette
import ru.alexgladkov.odyssey.compose.setup.OdysseyConfiguration
import ru.alexgladkov.odyssey.compose.setup.setNavigationContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initScreenFlow()
/*        setContent{
            Text(text = "text")
        }*/
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
                Text(text = "Test")
                val navigationConfiguration = OdysseyConfiguration(
                    canvas = this,
                    backgroundColor = Theme.colors.blackB

                )
                setNavigationContent(
                    configuration = navigationConfiguration
                ) {
                    generateGraph()
                }
            }
        }

}