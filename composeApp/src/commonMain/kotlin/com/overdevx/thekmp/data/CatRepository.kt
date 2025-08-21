package com.overdevx.thekmp.data

class CatRepository(private val api: CatApi) {
    suspend fun fetchFact(): String {
        return try {
            api.getCatFact().fact
        } catch (e: Exception) {
            "Error: ${e.message}"
        }
    }
}