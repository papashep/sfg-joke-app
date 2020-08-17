package guru.springframework.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// Changed to use XL configuration, the next line tells Spring where to find the XML configuration file
@ImportResource("classpath:chuck-config.xml")
public class JokeappApplication {

    public static void main (String[] args) {

        SpringApplication.run (JokeappApplication.class, args);

    }

}
