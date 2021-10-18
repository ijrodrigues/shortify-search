package br.com.shortify.shortifysearch.controller

import br.com.shortify.shortifysearch.dto.shortify.ShortifyResponse
import br.com.shortify.shortifysearch.service.UrlService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/shortify-search")
class UrlController(private val urlService: UrlService) {

    @GetMapping("/{id}")
    fun getUrlFromId(@PathVariable("id") id: String): ShortifyResponse {
        val url = urlService.findById(id)
        return ShortifyResponse(url.id, url.originalUrl)
    }
}
