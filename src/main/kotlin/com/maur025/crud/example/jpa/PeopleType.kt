package com.maur025.crud.example.jpa

import com.maur025.crud.example.common.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "people_types")
class PeopleType(
    @field:Column(name = "name", nullable = false) var name: String,

    @field:Column(name = "code", nullable = false) var code: String
) : BaseEntity()