package designpattern;

/**
 * Created by erzhang on 7/13/17.
 */
public class TestFactory {
    public static void main(String[] args) throws InterruptedException{
        for (int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
    }
}
