package designpattern;

/**
 * Created by erzhang on 7/13/17.
 */
public class GeneratorBelt extends Belt {
    public static class GenericFactory implements designpattern.GenericFactory<GeneratorBelt>{
        public GeneratorBelt create(){
            return new GeneratorBelt();
        }
    }
}
