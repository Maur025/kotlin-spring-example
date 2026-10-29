package com.maur025.crud.example.common

import jakarta.persistence.*
import java.util.*

@MappedSuperclass
abstract class BaseEntity(
    @field:Id @field:GeneratedValue(strategy = GenerationType.UUID) @field:Column(
        name = "id", nullable = false, updatable = false
    ) var id: UUID? = null
)