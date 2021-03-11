package com.uwaisalqadri.inknote.ui.main

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.uwaisalqadri.inknote.utils.Screen
import com.uwaisalqadri.inknote.utils.theme.InkTypography

@Composable
fun NoteScreen(navController: NavController) {
    Text(text = Screen.noteScreen)
    /**
     * this screen will show staggered grid list
     * and fab to navigate to write screen
     * **/
}

@Composable
fun NoteItem(title: String, date: String, description: String) {
    Card(
        shape = RoundedCornerShape(10),
        border = BorderStroke(2.dp, Color.Black),
        elevation = 8.dp
    ) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(18.dp)
                .width(140.dp)
                .clickable { /*TODO*/ }
        ) {
            Text(
                text = title,
                style = InkTypography.body1,
            )
            Text(
                text = date,
                style = InkTypography.caption
            )
            Text(
                text = description,
                style = InkTypography.body2
            )
            // TODO = "add image"
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    NoteItem("Note", "2202-19-29", "oke oke mantap oke oke mantap, oke oke mantap")
}