package designpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by erzhang on 7/13/17.
 */
public class Part {
    static List<GenericFactory<? extends  Part>> partFactories = new ArrayList<GenericFactory<? extends Part>>();

    static{
        partFactories.add(new FuelFilter.GenericFactory());
        partFactories.add(new AirFilter.GenericFactory());
        partFactories.add(new FanBelt.GenericFactory());
        partFactories.add(new GeneratorBelt.GenericFactory());
    }

    private static Random rand = new Random(47);

    public static Part createRandom(){
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }


    public String toString(){
        return getClass().getSimpleName();
    }

}
