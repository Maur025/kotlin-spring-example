package com.maur025.crud.example.common

import org.jetbrains.annotations.NotNull
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.validation.annotation.Validated
import java.util.*

@Validated
interface BaseService<T : Any, K : Any> {
    fun save(entity: T): T

    fun saveAll(entities: Collection<T>): Collection<T>

    fun existsById(@NotNull id: K): Boolean

    fun findById(@NotNull id: K): Optional<T>

    fun findByIdThrow(id: K): T

    fun findAll(): List<T>

    fun findAllById(ids: Iterable<K>): List<T>

    fun findAll(pageable: Pageable): Page<T>

    fun count(): Long

    fun deleteById(@NotNull id: K): Unit

    fun delete(@NotNull entity: T): Unit

    fun deleteAllById(ids: Collection<K>): Unit

    fun deleteAll(entities: Collection<T>): Unit
}