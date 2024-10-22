package com.pitercapistrano.buscarcepcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.pitercapistrano.buscarcepcompose.ui.theme.BuscarCEPComposeTheme
import com.pitercapistrano.buscarcepcompose.view.BuscarCep
import com.pitercapistrano.buscarcepcompose.view.DetalhesEndereco
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

                    composable(
                        "detalhesEndereco/{cep}/{logradouro}/{bairro}/{cidade}/{estado}",
                        arguments = listOf(
                            navArgument("cep"){type = NavType.StringType},
                            navArgument("logradouro"){type = NavType.StringType},
                            navArgument("bairro"){type = NavType.StringType},
                            navArgument("cidade"){type = NavType.StringType},
                            navArgument("estado"){type = NavType.StringType}
                            )
                    ){
                        DetalhesEndereco(
                            navController,
                            it.arguments?.getString("cep").toString(),
                            it.arguments?.getString("logradouro").toString(),
                            it.arguments?.getString("bairro").toString(),
                            it.arguments?.getString("cidade").toString(),
                            it.arguments?.getString("estado").toString()
                            )
                    }
                }
            }
        }
    }
}