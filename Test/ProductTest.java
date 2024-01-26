import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest
{

    @Test
    public void testConstructorsAndGetters()
    {
        Product product = new Product("123456", "TestProduct", "TestDescription", 10.50);

        assertEquals("123456", product.getID());
        assertEquals("TestProduct", product.getName());
        assertEquals("TestDescription", product.getDescription());
        assertEquals(10.50, product.getCost(), 0.001);
    }
    @Test
    public void testSetters()
    {
        Product product = new Product("123456", "TestProduct", "TestDescription", 10.50);

        product.setID("789012");
        product.setName("NewProduct");
        product.setDescription("NewDescription");
        product.setCost(20.75);

        assertEquals("789012", product.getID());
        assertEquals("NewProduct", product.getName());
        assertEquals("NewDescription", product.getDescription());
        assertEquals(20.75, product.getCost(), 0.001);
    }
    @Test
    public void testToCSVDataRecord()
    {
        Product product = new Product("123456", "TestProduct", "TestDescription", 10.50);
        assertEquals("123456,TestProduct,TestDescription,10.50", product.toCSVDataRecord());
    }
}