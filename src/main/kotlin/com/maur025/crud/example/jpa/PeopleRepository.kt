package com.maur025.crud.example.jpa

import com.maur025.crud.example.common.BaseRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface PeopleRepository : BaseRepository<People, UUID> {}