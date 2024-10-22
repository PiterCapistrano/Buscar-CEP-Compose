package com.pitercapistrano.buscarcepcompose.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pitercapistrano.buscarcepcompose.listener.RespostaApi
import com.pitercapistrano.buscarcepcompose.repositorio.Repositorio
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BuscarCepViewModel @Inject constructor(private val repositorio: Repositorio): ViewModel() {

    fun respostaApi(cep: String, respostaApi: RespostaApi){
        viewModelScope.launch {
            repositorio.respostaApi(cep, respostaApi)
        }
    }
}