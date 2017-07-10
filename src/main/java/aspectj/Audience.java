package aspectj;

import org.aspectj.lang.annotation.*;

/**
 * Created by erzhang on 6/14/17.
 */
@Aspect
public class Audience {

    @Pointcut("execution(** Performance.perform(..))")
    public void performance(){}


    @Before("performance()")
    public void silenceCellPhone(){
        System.out.println("Silence Cell Phone!");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP!");
    }
}
