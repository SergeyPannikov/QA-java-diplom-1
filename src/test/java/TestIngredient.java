import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class TestIngredient {
    Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100);

    @Test
    public void testGetName() {
        assertEquals("hot sauce", ingredient.getName());
    }

    @Test
    public void testGetPrice() {
        Assert.assertEquals(100F, ingredient.getPrice(), 0);
    }

    @Test
    public void testGetType() {
        Assert.assertEquals(IngredientType.SAUCE, ingredient.getType());
    }
}
