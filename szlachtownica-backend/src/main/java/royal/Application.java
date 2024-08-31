package royal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import royal.model.Family;
import royal.model.Person;
import royal.util.*;
import royal.util.simple.*;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

@SpringBootApplication
public class Application {

    static Random rand = new Random();

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class, args);
    }
}
