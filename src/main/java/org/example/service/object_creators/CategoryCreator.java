package org.example.service.object_creators;

import org.example.dto.CategoryDTO;
import org.example.service.UserDataService;

public class CategoryCreator {

    private static UserDataService dataService = new UserDataService();

    private static String name;

    public static CategoryDTO create() {
        return CategoryDTO
                .builder()
                .name(askForName())
                .build();
    }

    private static String askForName() {
        return name = dataService.getString("Enter category name: ");
    }
}
