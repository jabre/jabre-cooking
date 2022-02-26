package com.jabre.cooking.repositories;

import com.jabre.cooking.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Author : Jabre
 * Created : 2/23/2022, Wednesday
 **/
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
