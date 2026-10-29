package com.maur025.crud.example.jpa

import com.maur025.crud.example.common.BaseEntity
import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "people")
class People(
    @field:Column(name = "name", nullable = false) var name: String,

    @field:Column(name = "last_name") var lastName: String? = null,

    @field:Column(name = "document", nullable = false) var document: String,

    @field:Column(name = "people_type_id", nullable = false) var peopleTypeId: UUID,

    @field:ManyToOne(
        fetch = FetchType.LAZY, optional = false
    ) @field:JoinColumn(
        name = "people_type_id", referencedColumnName = "id", insertable = false, updatable = false
    ) var peopleType: PeopleType
) : BaseEntity()
