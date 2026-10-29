package com.maur025.crud.example.jpa

import com.maur025.crud.example.common.BaseRepository
import com.maur025.crud.example.common.BaseServiceImpl
import org.springframework.stereotype.Service
import java.util.*

@Service
class PeopleTypeService(val repository: PeopleTypeRepository) :
    BaseServiceImpl<PeopleType, UUID>() {
    override fun resourceName(): String = "People Type"

    override fun repository(): BaseRepository<PeopleType, UUID> = repository
}