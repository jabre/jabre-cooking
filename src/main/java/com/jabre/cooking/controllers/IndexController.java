package com.jabre.cooking.controllers;

import com.jabre.cooking.repositories.CategoryRepository;
import com.jabre.cooking.repositories.RecipeRepository;
import com.jabre.cooking.repositories.UnitOfMeasureRepository;
import com.jabre.cooking.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author : Jabre
 * Created : 12/12/2021, Sunday
 **/
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController( RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }



}
