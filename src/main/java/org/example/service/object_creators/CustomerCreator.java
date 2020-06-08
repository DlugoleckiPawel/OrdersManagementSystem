package org.example.service.object_creators;

import org.example.dto.CountryDTO;
import org.example.dto.CustomerDTO;
import org.example.repository.implement.CountryRepositoryImpl;
import org.example.repository.interfaces.CountryRepository;
import org.example.service.ServiceHelpers;
import org.example.service.UserDataService;

public class CustomerCreator {

    private static UserDataService dataService = new UserDataService();
    private static ServiceHelpers helpers = new ServiceHelpers();

    private static CountryRepository countryRepository = new CountryRepositoryImpl();

    private static String name;
    private static String surname;
    private static int age;
    private static String countryName;

    public static CustomerDTO create() {
        return CustomerDTO.builder()
                .name(askForName())
                .surname(askForSurname())
                .age(askForAge())
                .country(CountryDTO.builder().name(askForCountry()).build())
                .build();
    }

    private static String askForName() {
        return name = dataService.getString("Enter Customer name: ");
    }

    private static String askForSurname() {
        return surname = dataService.getString("Enter Customer surname: ");
    }

    private static int askForAge() {
        return age = dataService.getInt("Enter Customer age");
    }

    private static String askForCountry() {
        helpers.showAvailableCountry();
        return countryName = dataService.getString("Enter Country name");
    }
}
