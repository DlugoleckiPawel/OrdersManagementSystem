package org.example.service.object_creators;

import org.example.dto.TradeDTO;
import org.example.service.ServiceHelpers;
import org.example.service.UserDataService;

public class TradeCreator {

    private static UserDataService dataService = new UserDataService();
    private static ServiceHelpers helpers = new ServiceHelpers();

    private static String name;

    public static TradeDTO create() {
        return TradeDTO
                .builder()
                .name(askForName())
                .build();
    }

    private static String askForName() {
        helpers.showAvailableTrade();
        System.out.println("- - - - - - - - - - ");
        return name = dataService.getString("Enter Trade name: ");
    }
}
