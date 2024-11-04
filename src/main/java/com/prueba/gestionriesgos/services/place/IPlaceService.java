package com.prueba.gestionriesgos.services.place;

import com.prueba.gestionriesgos.domain.dto.PlaceDTO;

public interface IPlaceService {

    /**
     * Creates a new place with the given details.
     *
     * @param place The PlaceDTO containing the details of the place to create.
     * @return The created PlaceDTO with the generated ID.
     */
    PlaceDTO createPlace(PlaceDTO place);

}
