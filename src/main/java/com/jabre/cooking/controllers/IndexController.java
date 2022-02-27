package com.jabre.cooking.controllers;

import com.jabre.cooking.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author : Jabre
 * Created : 12/12/2021, Sunday
 **/
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController( RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        log.debug("In Index mapping");
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }



}
