package com.maur025.crud.example.jpa

import com.maur025.crud.example.common.BaseRepository
import com.maur025.crud.example.common.BaseServiceImpl
import org.springframework.stereotype.Service
import java.util.*

@Service
class PeopleService(val repository: PeopleRepository) : BaseServiceImpl<People, UUID>() {
    override fun resourceName(): String = "People"

    override fun repository(): BaseRepository<People, UUID> = repository
}