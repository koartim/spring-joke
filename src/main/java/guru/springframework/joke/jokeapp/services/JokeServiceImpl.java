package guru.springframework.joke.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
