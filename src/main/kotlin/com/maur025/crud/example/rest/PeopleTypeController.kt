package com.maur025.crud.example.rest

import com.maur025.crud.example.jpa.PeopleType
import com.maur025.crud.example.jpa.PeopleTypeService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping(path = [PEOPLE_TYPE_PATH])
@RestController
class PeopleTypeController(val peopleTypeService: PeopleTypeService) {

    @GetMapping
    fun findAll(): ResponseEntity<List<PeopleType>> {
        return ResponseEntity.ok().body(peopleTypeService.findAll())
    }
}