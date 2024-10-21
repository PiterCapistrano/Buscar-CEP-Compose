package com.pitercapistrano.buscarcepcompose.componentes

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pitercapistrano.buscarcepcompose.ui.theme.Green

@Composable
fun ButtonComponent(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier
){
    Button(
        onClick = { onClick },
        colors = ButtonDefaults.buttonColors(
            containerColor = Green
        ),
        modifier = modifier,
        shape = RoundedCornerShape(5.dp)
    ) {
        Text(text = text, fontSize = 18.sp, color = Color.White, fontWeight = FontWeight.Bold)
    }
}