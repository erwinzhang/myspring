package aspectj;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;

import javax.sound.midi.Track;
import java.lang.reflect.Method;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by erzhang on 6/15/17.
 */
public class TestClass {

    interface IntPredP{
        boolean test(Integer value);
    }

    private int addUp(Stream<Integer> numbers){
        return numbers.reduce(0, (x, y) -> x+ y);
    }

    private void testSet(){
        Set<Integer> numbers = new HashSet<Integer>(Arrays.asList(1,3,4));
        System.out.println(numbers);
        List<Integer> sameOrder = numbers.stream().collect(Collectors.toList());
        System.out.println(sameOrder);
    }

    public static void main(String[] args){


        Set<String> c = new HashSet<>();

        Collection<String> d = Arrays.asList("one","two","zer");

        Collection<String> e = Collections.singleton("three");

        c.add("zero");
        c.addAll(d);
        c.add("zero");
        System.out.println(c);
        System.out.println(c.toArray(new String[c.size()]));

        String s3 = "s";
        String s4 = "s";
        System.out.println(s3==s4);

        Integer i = 2017;
        Integer j = 2017;
        System.out.println(i==j);


        String s1 = new String("s");
        String s2 = new String("s");
        System.out.println(s1.intern()==s2.intern());



        /*
        Predicate<Integer> atLeast5 = x -> x>5;
        System.out.println(atLeast5.test(6));

        BinaryOperator<Long> addLongs = (x, y) -> x+ y;
        long a = 123L, b = 222L;
        System.out.println(addLongs.apply(a, b));

        Runnable hello = () -> System.out.println("Hello world");
        hello.run();


        List<String> collected = Stream.of("a","b","c").collect(Collectors.toList());
        Assert.assertEquals(collected, Arrays.asList("a","b","c"));

//        List<String> map = Stream.of("Hello","1World","5gg").map(string -> {
//            System.out.println("HH");
//            return string;
//        }).collect(Collectors.toList());
//        Assert.assertEquals(Arrays.asList("1World","5gg"), map);

       TestClass tc =  new TestClass();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
       int c = tc.addUp(numbers.stream());
        System.out.println(c);
        */
//        TestClass tc =  new TestClass();
//        tc.testSet();
//        tc.testSet();
//        tc.testSet();

//        List<?> list = new ArrayList<String>();
//
//        Object rcvr = "b";
//
//        try {
//            Class<?>[] argTypes = new Class[]{};
//            Object[] arg = null;
//
//            Method meth = rcvr.getClass().getMethod("hashCode", argTypes);
//
//            Object ret = meth.invoke(rcvr, arg);
//
//            System.out.println(ret);
//            System.out.println(rcvr.hashCode());
//            System.out.println(rcvr.getClass().getMethods());
//
//
//        }catch (Exception e){
//
//        }


    }

}
