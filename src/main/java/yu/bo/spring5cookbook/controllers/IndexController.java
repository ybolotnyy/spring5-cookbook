package yu.bo.spring5cookbook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import yu.bo.spring5cookbook.domain.Category;
import yu.bo.spring5cookbook.domain.UnitOfMeasure;
import yu.bo.spring5cookbook.repositories.CategoryRepository;
import yu.bo.spring5cookbook.repositories.UnitOfMeasureRepository;
import yu.bo.spring5cookbook.services.RecipeService;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}