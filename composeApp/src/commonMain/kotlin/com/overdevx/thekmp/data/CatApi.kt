package com.overdevx.thekmp.data

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.Serializable

@Serializable
data class CatFact(val fact: String, val length: Int)

class CatApi(private val client: HttpClient) {
    suspend fun getCatFact(): CatFact {
        return client.get("https://catfact.ninja/fact").body()
    }
}

fun createHttpClient() = HttpClient {
    install(ContentNegotiation) {
        json()
    }
}