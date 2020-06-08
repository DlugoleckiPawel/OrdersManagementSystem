package org.example.repository.interfaces;

import org.example.generic.GenericRepository;
import org.example.model.entities.Customer;

import java.util.Optional;

public interface CustomerRepository extends GenericRepository<Customer> {
    Optional<Customer> findGivenCustomer(String name, String surname, String countryName);

}
