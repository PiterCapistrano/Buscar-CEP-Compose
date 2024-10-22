package com.pitercapistrano.buscarcepcompose.repositorio

import com.pitercapistrano.buscarcepcompose.data.DataSource
import com.pitercapistrano.buscarcepcompose.listener.RespostaApi
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repositorio @Inject constructor(private val dataSource: DataSource) {

    fun respostaApi(cep: String, respostaApi: RespostaApi){

        dataSource.respostaApi(cep, respostaApi)

    }
}