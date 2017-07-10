package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by erzhang on 4/7/17.
 */
@Configuration
@Import(CDConfig.class)
public class CDPlayerConfig {

//    @Bean
//    public CompactDisc sgtPeppers(){
//        return new SgtPeppers();
//    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }

//    @Bean
//    public CompactDisc randomBeatLesCD(){
//        int choice = (int) Math.floor(Math.random() * 4);
//        if(choice == 0){
//            return new SgtPeppers();
//        }else {
//            return new HardDaysNight();
//        }
//    }

}
