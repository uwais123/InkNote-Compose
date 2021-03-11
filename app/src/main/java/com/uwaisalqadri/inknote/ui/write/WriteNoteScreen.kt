package com.uwaisalqadri.inknote.ui.write

import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomSheetScaffold
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@ExperimentalMaterialApi
@Composable
fun WriteNoteScreen() {
    BottomSheetScaffold(
        sheetContent = {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                Text(text = "Hello from sheet")
            }
    }, sheetPeekHeight = 0.dp
    ) {
        // TODO = still confuse how to use it
    }
}