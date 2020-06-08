package org.example.service.object_creators;

import org.example.dto.CountryDTO;
import org.example.service.UserDataService;

public class CountryCreator {

    private static UserDataService dataService = new UserDataService();

    private static String name;

    public static CountryDTO create() {
        return CountryDTO
                .builder()
                .name(askForName())
                .build();
    }

    private static String askForName() {
        return name = dataService.getString("Enter country name: ");
    }
}
