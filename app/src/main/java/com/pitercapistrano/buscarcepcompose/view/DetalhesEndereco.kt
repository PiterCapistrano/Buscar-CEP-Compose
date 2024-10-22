package com.pitercapistrano.buscarcepcompose.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun DetalhesEndereco(
    navController: NavController,
    cep: String,
    logradouro: String,
    bairro: String,
    cidade: String,
    estado: String
){
    Column() {
        Text(text = cep)
        Text(text = logradouro)
        Text(text = bairro)
        Text(text = cidade)
        Text(text = estado)
    }

}