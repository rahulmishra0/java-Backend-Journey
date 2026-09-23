package CustomException;

public class ProductNotFoundException extends RuntimeException{
    //this class exception not available in java but we can inherit exception class


    //Parameterized constructor for object restriction with massage
    ProductNotFoundException(String msg){
        super(msg);  //Parent class constructor use karne ke liye
    }
}
