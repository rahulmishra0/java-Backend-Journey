package CustomException;

public class ProductService {
    void findProduct(int productId){
        if (productId != 101){
            //Ab yaha kya JVM ProductNotFoundException throw kar payega -> NAHI
            //So we need throw to throw the Exception
            throw new ProductNotFoundException("Product not found"); //Custom Exception
        }
        System.out.println("Product found");
    }
}
