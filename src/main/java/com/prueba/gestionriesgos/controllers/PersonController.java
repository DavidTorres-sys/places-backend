package com.prueba.gestionriesgos.controllers;

import com.prueba.gestionriesgos.domain.dto.PersonDTO;
import com.prueba.gestionriesgos.domain.entity.Person;
import com.prueba.gestionriesgos.services.person.IPersonService;
import com.prueba.gestionriesgos.utils.common.StandardResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/person")
public class PersonController {

    private final IPersonService personService;

    @Autowired
    public PersonController(IPersonService personService) {
        this.personService = personService;
    }

    @Operation(summary = "Create a new person")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Person created", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = PersonDTO.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = StandardResponse.class))
            }),
            @ApiResponse(responseCode = "409", description = "Person already exist", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = StandardResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = RuntimeException.class))
            })
    })
    @PostMapping("/")
    public ResponseEntity<PersonDTO> createPerson(PersonDTO personDTO) {
        PersonDTO person = personService.createPerson(personDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(person);
    }
}
