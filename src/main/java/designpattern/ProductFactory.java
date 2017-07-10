package designpattern;

/**
 * Created by erzhang on 6/14/17.
 */
public class ProductFactory {

    public ProductFactory(){

    }

    public static IProduct createProduct(String productName){
        if(productName == null){
            return null;
        }
        if(productName.equalsIgnoreCase("A")){
            return new ProductA();
        }
        if(productName.equalsIgnoreCase("B")){
            return new ProductB();
        }
        else{
            return null;
        }
    }
}
