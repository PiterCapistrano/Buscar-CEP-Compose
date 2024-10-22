package com.pitercapistrano.buscarcepcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pitercapistrano.buscarcepcompose.ui.theme.BuscarCEPComposeTheme
import com.pitercapistrano.buscarcepcompose.view.BuscarCep
import com.pitercapistrano.buscarcepcompose.viewModel.BuscarCepViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuscarCEPComposeTheme {

                val navController: NavHostController = rememberNavController()
                val viewModel: BuscarCepViewModel = hiltViewModel()

                NavHost(navController = navController, startDestination = "buscarCep"){
                    composable("buscarCep"){
                        BuscarCep(navController, viewModel)
                    }
                }
            }
        }
    }
}