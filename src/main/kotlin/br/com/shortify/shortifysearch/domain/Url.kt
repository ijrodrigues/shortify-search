package br.com.shortify.shortifysearch.domain

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash

@RedisHash(value = "url")
data class Url(
    val originalUrl : String,
    @Id
    val id: String
)
