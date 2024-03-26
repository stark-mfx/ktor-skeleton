package com.ktor.skeleton.data.dto.response

import kotlinx.serialization.Serializable
import java.time.LocalDateTime
import com.ktor.skeleton.helper.LocalDateTimeSerializer

data class UserResponseDto(
    val username: String,
    val name: String,
    val email: String,
    val age: Int?,
    @Serializable(with = LocalDateTimeSerializer::class)
    val createdAt: LocalDateTime
)