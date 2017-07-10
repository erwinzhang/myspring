package soundsystem;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Profile;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by erzhang on 4/7/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest{

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().mute().enableLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotbeNull(){
        Assert.assertNotNull(cd);
        System.out.println(cd);
        List<String> s =  new ArrayList<String>();

    }

    @Test
    public void play(){
        player.play();
        String log = systemOutRule.getLog();
        cd.play();
        String log1 = systemOutRule.getLog();
        Assert.assertEquals("Playing Sgt. Pepper's Longly Heart By The Beatless",systemOutRule.getLog());
    }
}
