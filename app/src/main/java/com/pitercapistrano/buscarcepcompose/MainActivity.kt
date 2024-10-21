package com.pitercapistrano.buscarcepcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pitercapistrano.buscarcepcompose.ui.theme.BuscarCEPComposeTheme
import com.pitercapistrano.buscarcepcompose.view.BuscarCep

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuscarCEPComposeTheme {

                val navController: NavHostController = rememberNavController()

                NavHost(navController = navController, startDestination = "buscarCep"){
                    composable("buscarCep"){
                        BuscarCep(navController)
                    }
                }
            }
        }
    }
}