package com.prueba.gestionriesgos.controllers;

import com.prueba.gestionriesgos.domain.dto.PersonDTO;
import com.prueba.gestionriesgos.domain.dto.PlaceDTO;
import com.prueba.gestionriesgos.services.place.IPlaceService;
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
@RequestMapping("/v1/place")
public class PlaceController {

    private final IPlaceService placeService;

    @Autowired
    public PlaceController(IPlaceService placeService) {
        this.placeService = placeService;
    }

    /**
     * Creates a new place with the given details.
     *
     * @param placeDTO The placeDTO containing the details of the person to create.
     * @return The created placeDTO with the generated ID.
     */
    @Operation(summary = "Create a new place")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Place created", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = PlaceDTO.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = StandardResponse.class))
            }),
            @ApiResponse(responseCode = "409", description = "Place already exist", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = StandardResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = RuntimeException.class))
            })
    })
    @PostMapping("/")
    public ResponseEntity<PlaceDTO> createPerson(PlaceDTO placeDTO) {
        return new ResponseEntity<>(placeService.createPlace(placeDTO), HttpStatus.CREATED);
    }

}
