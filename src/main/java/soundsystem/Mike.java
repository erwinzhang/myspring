package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by erzhang on 4/8/17.
 */

public class Mike implements CompactDisc{

    private String beat = "Beat it";
    public void play() {
        System.out.println("Playing" + beat);
    }
}
