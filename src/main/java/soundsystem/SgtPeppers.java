package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by erzhang on 4/7/17.
 */

@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Longly Heart";
    private String artist = "The Beatless";
    public void play() {
        System.out.print("Playing " + title + " By " + artist);
    }

}
