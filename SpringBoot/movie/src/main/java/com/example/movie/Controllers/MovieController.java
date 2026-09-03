package com.example.movie.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {
    @GetMapping("/movie")
    public String Movie(Model model){

        String title = "<h1>SpiderMan : Brand New Day</h1>";
        String FirstLineDesc = "Peter Parker devotes his life to protecting New York City as a full-time Spider-Man.";
        String MovieDescription ="<b>Full Description : </b>"+FirstLineDesc+"<br>But as the demands on him intensify, the pressure sparks a surprising physical evolution that threatens his existence, even as a strange new pattern of crimes gives rise to one of the most powerful threats he's ever faced.";

        boolean isLoggedIn = true;

        model.addAttribute("Title", title);
        model.addAttribute("FirstLine", FirstLineDesc);
        model.addAttribute("movieDesc", MovieDescription);
        model.addAttribute("login", isLoggedIn);

        return "movie";
    }
    
    
}
