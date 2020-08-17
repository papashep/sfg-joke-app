package guru.springframework.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by Melvyn on 17/Aug/2020
 */
///*
// We are creating this class to use Java Annotation Configuration, just for an example.
// =====================================================================================
// We had to create a config class 'ChuckConfiguration' and within that instantiate 'ChuckNorrisQuotes' object, we also
// had to specify the method with an @Bean annotation. See JokeServiceImpl for the changes we made in this class.
// */
//@Configuration
//public class ChuckConfiguration {
//
//    @Bean
//    public ChuckNorrisQuotes chuckNorrisQuotes() {
//        return new ChuckNorrisQuotes ();
//    }
//
//}

/*
 We are creating this class to use  XML Configuration, just for an example.
 =====================================================================================
 We had to create an XML configuration file, remove the Spring @Configuration and @Bean annotations from this file.
 We altered the JokeappApplication and inserted @ImportResource("classpath:chuck-config.xml") to tell spring where to
 find the XML configuration file which contains the line:
        <bean name="chuckNorrisQuotes" class="guru.springframework.norris.chuck.ChuckNorrisQuotes"/>
 */

public class ChuckConfiguration {

    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes ();
    }

}
