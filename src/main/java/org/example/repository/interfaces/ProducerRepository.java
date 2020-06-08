package org.example.repository.interfaces;

import org.example.generic.GenericRepository;
import org.example.model.entities.Producer;

import java.util.Optional;

public interface ProducerRepository extends GenericRepository<Producer> {
	Optional<Producer> findGivenProducer(String name, String countryName, String tradeName);
}
