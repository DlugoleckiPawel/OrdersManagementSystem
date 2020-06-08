package org.example.repository.interfaces;

import org.example.generic.GenericRepository;
import org.example.model.entities.Trade;

import java.util.Optional;

public interface TradeRepository extends GenericRepository<Trade> {
	Optional<Trade> findOneByName(String name);

	Optional<Trade> findGivenTrade(String name);
}
