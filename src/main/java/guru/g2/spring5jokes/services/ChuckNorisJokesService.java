package guru.g2.spring5jokes.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Primary
@Service
public class ChuckNorisJokesService implements JokesService {

	final private ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

	@Override
	public String getJoke() {
		// TODO Auto-generated method stub
		return chuckNorrisQuotes.getRandomQuote();
	}

}
