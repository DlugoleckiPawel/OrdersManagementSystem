package org.example.repository.interfaces;

import org.example.generic.GenericRepository;
import org.example.model.entities.Category;

import java.util.Optional;

public interface CategoryRepository extends GenericRepository<Category> {
    Optional<Category> findOneByName(String name);

}
