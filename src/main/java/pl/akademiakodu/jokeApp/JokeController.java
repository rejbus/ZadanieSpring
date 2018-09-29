package pl.akademiakodu.jokeApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.akademiakodu.jokeApp.service.JokeService;

@Controller
public class JokeController {
    @Autowired
    private JokeService jokeService;
    @RequestMapping({"/",""})
    public String schowJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "home";

    }
}