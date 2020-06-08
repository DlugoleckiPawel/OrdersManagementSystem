package org.example.repository.interfaces;

import org.example.generic.GenericRepository;
import org.example.model.entities.Shop;

import java.util.Optional;

public interface ShopRepository extends GenericRepository<Shop> {
	Optional<Shop> findOneByName(String name);

	Optional<Shop> findGivenShop(String shopName, String countryName);
}
