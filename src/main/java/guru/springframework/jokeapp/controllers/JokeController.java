package guru.springframework.jokeapp.controllers;

/**
 * Created by Melvyn on 16/Aug/2020
 */

import guru.springframework.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired    // Not required in Spring Boot 2 for constructors, but you can still specify it if you want to.
    public JokeController (JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})       // This will map out the context root for us.
    public String showJoke(Model model) {

        model.addAttribute ("joke",jokeService.getJoke ());  // A random joke from the joke string

        return "chucknorris";   // View name

    }

}
