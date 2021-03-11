package com.uwaisalqadri.inknote.ui.main

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.uwaisalqadri.inknote.R
import com.uwaisalqadri.inknote.data.model.Note
import com.uwaisalqadri.inknote.utils.Screen
import com.uwaisalqadri.inknote.utils.theme.InkTypography

/**
 * this screen will show staggered grid list
 * and fab to navigate to write screen
 * **/
@Composable
fun NoteScreen(
    notes: List<Note>,
    navController: NavController
) {
    StaggeredVerticalGrid(
        maxColumnWidth = 220.dp,
        modifier = Modifier.padding(4.dp)
    ) {
        notes.forEach { item ->
            NoteItem(item, navController)
        }
    }
}

@Composable
fun NoteItem(note: Note, navController: NavController) {
    Card(
        shape = RoundedCornerShape(10),
        border = BorderStroke(2.dp, Color.Black),
        elevation = 8.dp
    ) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(18.dp)
                .fillMaxWidth()
                .clickable { navController.navigate(Screen.writeNoteScreen) }
        ) {
            Text(
                text = note.title.toString(),
                style = InkTypography.body1,
            )
            Text(
                text = note.date.toString(),
                style = InkTypography.caption
            )
            Text(
                text = note.description.toString(),
                style = InkTypography.body2
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_edit),
                contentDescription = "ic_edit",
                Modifier
                    .clickable {  }
            )
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
//    NoteItem(notes)
}