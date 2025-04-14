package com.tecsup.lab04

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.runtime.*

@Composable
fun AlertDialogExample() {
    var showDialog by remember { mutableStateOf(true) }

    if (showDialog) {
        AlertDialog(
            onDismissRequest = {
                showDialog = false
            },
            title = {
                Text(text = "Título del diálogo")
            },
            text = {
                Text("Este es un ejemplo de AlertDialog.")
            },
            confirmButton = {
                Button(onClick = {
                    showDialog = false
                }) {
                    Text("Aceptar")
                }
            },
            dismissButton = {
                Button(onClick = {
                    showDialog = false
                }) {
                    Text("Cancelar")
                }
            }
        )
    }
}
