package com.maur025.crud.example.rest

import com.maur025.crud.example.jpa.People
import com.maur025.crud.example.jpa.PeopleService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping(path = [PEOPLE_PATH])
@RestController
class PeopleController(val peopleService: PeopleService) {

    @GetMapping
    fun findAll(): ResponseEntity<List<People>> {
        return ResponseEntity.ok().body(peopleService.findAll())
    }
}