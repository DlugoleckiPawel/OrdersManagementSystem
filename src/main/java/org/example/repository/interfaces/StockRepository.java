package org.example.repository.interfaces;

import org.example.generic.GenericRepository;
import org.example.model.entities.Stock;

import java.util.Optional;

public interface StockRepository extends GenericRepository<Stock> {
	Optional<Stock> findGivenStock(Long productId, Long shopId);

	Optional<Stock> findOneStock(String productName, String categoryName, String producerName, String shopName, String countryName);


}
