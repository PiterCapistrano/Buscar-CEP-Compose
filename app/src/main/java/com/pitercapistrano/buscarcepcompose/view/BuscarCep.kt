package com.pitercapistrano.buscarcepcompose.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.pitercapistrano.buscarcepcompose.ui.theme.Green

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BuscarCep(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { 
                Text(text = "Buscador de CEP", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    titleContentColor = Color.White,
                    containerColor = Green
                )
            )
        }
    ) {

        
    }
}

@Preview
@Composable
fun BuscarCepPreview(){
    BuscarCep(navController = rememberNavController())
}