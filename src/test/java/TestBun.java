import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class TestBun {
    Bun bun1 = new Bun("black bun", 120);

    @Test
    public void testGetName() {
        assertEquals("black bun", bun1.getName());
    }

    @Test
    public void testGetPrice() {
        Assert.assertEquals(120, bun1.getPrice(), 0);
    }
}
