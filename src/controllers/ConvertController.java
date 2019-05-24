package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConvertController {
    @RequestMapping(value = "app" , method = RequestMethod.GET)
    public String application () {
        return "index";
    }
    @RequestMapping (value = "app", method = RequestMethod.POST)
    public String application (double currency,double rate, Model model) {
        model.addAttribute("currency", currency);
        model.addAttribute("rate", rate);
        double result = currency * rate;
        model.addAttribute("result",result);
        return "index";
    }

}
