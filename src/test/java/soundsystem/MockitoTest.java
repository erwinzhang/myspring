package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Created by erzhang on 4/12/17.
 */
@RunWith(PowerMockRunner.class)
public class MockitoTest {

    @Mock
    MediaPlayer player;

    @Test
    public void testPlayer(){
        player.play();
        player.play();
    }

}
