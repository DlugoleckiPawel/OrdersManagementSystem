package org.example.repository.interfaces;

import org.example.generic.GenericRepository;
import org.example.model.entities.Country;

import java.util.Optional;

public interface CountryRepository extends GenericRepository<Country> {
	Optional<Country> findOneByName(String name);
}
