package com.pitercapistrano.buscarcepcompose.api

import com.pitercapistrano.buscarcepcompose.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ViaCep {
    @GET("ws/{cep}/json/")
    fun setEndereco(@Path("cep") cep: String): Call<Endereco>
}