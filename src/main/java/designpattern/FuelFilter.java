package designpattern;

/**
 * Created by erzhang on 7/13/17.
 */
public class FuelFilter extends Filter {

    public static class GenericFactory implements designpattern.GenericFactory<FuelFilter>{
        public FuelFilter create(){
            return new FuelFilter();
        }
    }
}
