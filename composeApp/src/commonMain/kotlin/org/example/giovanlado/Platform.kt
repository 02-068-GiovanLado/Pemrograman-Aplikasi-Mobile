package org.example.giovanlado

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform