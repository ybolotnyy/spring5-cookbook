package yu.bo.spring5cookbook.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import yu.bo.spring5cookbook.model.Recipe;
import yu.bo.spring5cookbook.repositories.RecipeRepository;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;


    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void addNewRecipe() throws Exception {

        int initial_recipes_count = recipeService.getRecipes().size();

        Recipe recipe = new Recipe();
        HashSet receipesData = new HashSet();

        receipesData.add(recipe);

        when(recipeService.getRecipes()).thenReturn(receipesData);

        int new_recipes_count = recipeService.getRecipes().size();

        assertEquals(new_recipes_count, initial_recipes_count + 1);
        verify(recipeRepository, times(2)).findAll();
    }


    @Test
    public void addThenDeleteRecipe() throws Exception {

        int initial_recipes_count = recipeService.getRecipes().size();

        Recipe recipe = new Recipe();
        HashSet receipesData = new HashSet();

        receipesData.add(recipe);
        receipesData.remove(recipe);

        when(recipeService.getRecipes()).thenReturn(receipesData);

        int new_recipes_count = recipeService.getRecipes().size();

        assertEquals(new_recipes_count, initial_recipes_count);
    }


    @Test
    public void addMultipleRecipes() throws Exception {

        int numberToAdd = 10;
        int initial_recipes_count = recipeService.getRecipes().size();

        HashSet receipesData = new HashSet();

        // populate 10 new recipes
        for (int i = 0; i < numberToAdd; i++) {
            receipesData.add(new Recipe());
        }

        when(recipeService.getRecipes()).thenReturn(receipesData);

        int new_recipes_count = recipeService.getRecipes().size();

        assertEquals(new_recipes_count, initial_recipes_count + numberToAdd);
    }

}