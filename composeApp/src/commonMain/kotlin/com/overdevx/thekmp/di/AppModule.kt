package com.overdevx.thekmp.di

import com.overdevx.thekmp.data.CatApi
import com.overdevx.thekmp.data.CatRepository
import com.overdevx.thekmp.data.createHttpClient
import com.overdevx.thekmp.presentation.CatViewModel
import org.koin.dsl.module

val appModule = module {
    single { createHttpClient() }
    single { CatApi(get()) }
    single { CatRepository(get()) }
    single { CatViewModel(get()) }
}