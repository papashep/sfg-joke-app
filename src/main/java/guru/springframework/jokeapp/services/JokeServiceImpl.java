package guru.springframework.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by Melvyn on 16/Aug/2020
 */

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    /*
        We have generated the constructor this way so Spring only loads the class once and keeps re-using the same
        class object. More efficient.
     */
    public JokeServiceImpl () {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes ();
    }

    @Override
    public String getJoke () {
        return chuckNorrisQuotes.getRandomQuote ();
    }

}
