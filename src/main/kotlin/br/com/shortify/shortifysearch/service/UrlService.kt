package br.com.shortify.shortifysearch.service

import br.com.shortify.shortifysearch.domain.Url
import br.com.shortify.shortifysearch.repository.UrlRepository
import org.springframework.stereotype.Service

@Service
class UrlService(
    private val urlRepository: UrlRepository,
) {

    fun findById(id : String): Url {
        //todo: throw a specific exception
        return urlRepository.findById(id).orElseThrow()
    }
}
