package yu.bo.spring5cookbook.repositories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import yu.bo.spring5cookbook.model.Category;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CategoryRepositoryIntegrationTest {

    @Autowired
    CategoryRepository categoryRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findCategoryByDescription() throws Exception {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("Ukrainian");

        assertEquals("Ukrainian", categoryOptional.get().getDescription());
    }

    @Test
    public void findCategoryByDescriptionIndian() throws Exception {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("Indian");

        assertEquals("Indian", categoryOptional.get().getDescription());
    }
}