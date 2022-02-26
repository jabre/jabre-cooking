package com.jabre.cooking.services;

import com.jabre.cooking.domain.Recipe;

import java.util.Set;

/**
 * Author : Jabre
 * Created : 2/26/2022, Saturday
**/public interface RecipeService {

    Set<Recipe> getRecipes();
}
