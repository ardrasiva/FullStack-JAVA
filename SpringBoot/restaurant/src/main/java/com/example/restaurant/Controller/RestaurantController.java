package com.example.restaurant.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.restaurant.Model.Restaurant;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class RestaurantController {

    @GetMapping("/dish")
    public String blankDish(Model model) {

        model.addAttribute("message", "Enter the dish name and price in the URL.");
        return "dishDetails";
    }
    

    @GetMapping("/dish/{name}/{price}")
    public String getDishDetails(@PathVariable String name, @PathVariable float price, Model model) {

        Restaurant r = new Restaurant();

        r.setName(name);
        r.setPrice(price);

        model.addAttribute("dishdetails", r);
        return "dishDetails";
    }
    
    
}
