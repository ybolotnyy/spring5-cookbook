package yu.bo.spring5cookbook.services;

import yu.bo.spring5cookbook.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}