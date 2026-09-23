package CustomException;

public class ProductTest {
    public static void main(String[] args) {
        ProductService service = new ProductService();

        try {
            service.findProduct(300);
        }
        catch (ProductNotFoundException e){ //Custom Exception
            System.out.println(e.getMessage());
        }

    }
}
