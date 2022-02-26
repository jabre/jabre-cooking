package com.jabre.cooking.repositories;

import com.jabre.cooking.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Author : Jabre
 * Created : 2/23/2022, Wednesday
 **/
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
