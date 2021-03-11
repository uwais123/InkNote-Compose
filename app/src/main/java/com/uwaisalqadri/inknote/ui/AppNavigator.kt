package com.uwaisalqadri.inknote.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.uwaisalqadri.inknote.ui.main.NoteScreen
import com.uwaisalqadri.inknote.ui.settings.SettingsScreen
import com.uwaisalqadri.inknote.ui.write.WriteNoteScreen
import com.uwaisalqadri.inknote.utils.Screen

@Composable
fun AppNavigator() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.noteScreen
    ) {
        composable(Screen.noteScreen) { NoteScreen(navController) }
        composable(Screen.writeNoteScreen) { WriteNoteScreen() }
        composable(Screen.settingsScreen) { SettingsScreen() }
    }
}
