package com.jabre.cooking.repositories;

import com.jabre.cooking.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Author : Jabre
 * Created : 2/23/2022, Wednesday
 **/
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
