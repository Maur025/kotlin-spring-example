package com.maur025.crud.example.rest

import com.maur025.crud.example.jpa.PeopleType
import java.util.*

data class PeopleResponse(
    val id: UUID,
    val name: String,
    val lastName: String,
    val document: String,

    val peopleTypeId: UUID,
    val peopleType: PeopleType
)
