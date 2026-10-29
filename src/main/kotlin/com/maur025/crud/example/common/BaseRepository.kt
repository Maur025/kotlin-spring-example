package com.maur025.crud.example.common

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface BaseRepository<T : Any, K : Any> : JpaRepository<T, K>, JpaSpecificationExecutor<T> {}