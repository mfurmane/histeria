package royal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan
public class Config {

    @Autowired
    private Main main;

//    @Bean
//    public Main main() {
//        Main main = new Main();
//        return main;
//    }



    @PostConstruct
    public void init() {
        try {
            main.run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
