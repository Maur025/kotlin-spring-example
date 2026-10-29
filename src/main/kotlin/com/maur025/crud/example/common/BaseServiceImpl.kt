package com.maur025.crud.example.common

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Transactional(readOnly = true)
abstract class BaseServiceImpl<T : Any, K : Any> : BaseService<T, K> {
    protected abstract fun resourceName(): String

    protected abstract fun repository(): BaseRepository<T, K>

    @Transactional
    override fun save(entity: T): T = repository().save(entity)

    @Transactional
    override fun saveAll(entities: Collection<T>): Collection<T> = repository().saveAll(entities)

    override fun existsById(id: K): Boolean = repository().existsById(id)

    override fun findById(id: K): Optional<T> = repository().findById(id)

    override fun findByIdThrow(id: K): T =
        findById(id).orElseThrow { NoSuchElementException("value with id $id not found") }

    override fun findAll(): List<T> = repository().findAll()

    override fun findAllById(ids: Iterable<K>): List<T> = repository().findAllById(ids)

    override fun findAll(pageable: Pageable): Page<T> = repository().findAll(pageable)

    override fun count(): Long = repository().count()

    @Transactional
    override fun deleteById(id: K) {
        repository().deleteById(id)
    }

    @Transactional
    override fun delete(entity: T) {
        repository().delete(entity)
    }

    @Transactional
    override fun deleteAllById(ids: Collection<K>) {
        repository().deleteAllById(ids)
    }

    @Transactional
    override fun deleteAll(entities: Collection<T>) {
        repository().deleteAll(entities)
    }
}