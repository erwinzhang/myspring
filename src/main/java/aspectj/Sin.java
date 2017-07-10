package aspectj;

/**
 * Created by erzhang on 6/14/17.
 */
public class Sin {
    private static Sin ourInstance = new Sin();

    public static Sin getInstance() {
        return ourInstance;
    }

    private Sin() {
    }
}
