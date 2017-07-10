package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by erzhang on 4/10/17.
 */
@Component
public class HardDaysNight implements CompactDisc {

    public void play() {
        System.out.print("Playing By HardDaysNight");
    }
}
