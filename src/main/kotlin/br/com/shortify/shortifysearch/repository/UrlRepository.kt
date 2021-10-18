package br.com.shortify.shortifysearch.repository

import br.com.shortify.shortifysearch.domain.Url
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UrlRepository : CrudRepository<Url, String>
