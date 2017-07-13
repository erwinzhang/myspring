package designpattern;

/**
 * Created by erzhang on 7/13/17.
 */
public class FanBelt extends Belt {
    public static class GenericFactory implements designpattern.GenericFactory<FanBelt>{
        public FanBelt create(){
            return new FanBelt();
        }
    }
}
