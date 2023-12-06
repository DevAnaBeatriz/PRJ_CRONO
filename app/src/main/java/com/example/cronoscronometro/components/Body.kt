package com.example.cronoscronometro.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TituloHome(title: String) {
    Text(text = title, color = Color.White, fontWeight = FontWeight.Bold)
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Label(value: String, onValueChange: (String) -> Unit, label: String) {
    OutlinedTextField(
        value = value,
        colors = TextFieldDefaults.textFieldColors(
            textColor = if (value.isNotEmpty()) Color.White else Color.Black,
            containerColor = Color.Black,
            cursorColor = if (value.isNotEmpty()) Color.White else Color.Black,
            focusedIndicatorColor = Color.White,
            focusedLabelColor = Color.White,
            focusedLeadingIconColor = Color.White,
            unfocusedLeadingIconColor = Color.White,
            unfocusedIndicatorColor = Color.White,
            unfocusedLabelColor = Color.White,
            unfocusedSupportingTextColor = Color.White,
            unfocusedTrailingIconColor = Color.White
        ),
        onValueChange = onValueChange,
        label = { Text(text = label, color = if (value.isNotEmpty()) Color.Black else Color.Black) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
            .padding(bottom = 15.dp)
    )
}



@Composable
fun formatTiempo(tiempo: Long): String {
    val segundos = (tiempo / 1000) % 60
    val minutos = (tiempo / 1000 / 60) % 60
    val horas = tiempo / 1000 / 3600
    return String.format("%02d:%02d:%02d", horas, minutos, segundos)
}




