package com.overdevx.thekmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform