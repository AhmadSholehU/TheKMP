package com.overdevx.thekmp.presentation

import com.overdevx.thekmp.data.CatRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CatViewModel(private val repository: CatRepository) {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    private val _fact = MutableStateFlow("Loading...")
    val fact = _fact.asStateFlow()

    init {
        loadFact()
    }

    fun loadFact() {
        scope.launch {
            _fact.value = repository.fetchFact()
        }
    }
}