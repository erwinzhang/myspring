package designpattern;

/**
 * Created by erzhang on 7/13/17.
 */
public class AirFilter extends Filter {
    public static class GenericFactory implements designpattern.GenericFactory<AirFilter>{
        public AirFilter create(){
            return new AirFilter();
        }
    }
}
