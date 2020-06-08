package org.example.repository.interfaces;

import org.example.generic.GenericRepository;
import org.example.model.entities.Product;

import java.util.Optional;

public interface ProductRepository extends GenericRepository<Product> {
	Optional<Product> findOneByName(String productName);

	Optional<Product> findGivenProduct(String productName, String categoryName, String producerName);

}
