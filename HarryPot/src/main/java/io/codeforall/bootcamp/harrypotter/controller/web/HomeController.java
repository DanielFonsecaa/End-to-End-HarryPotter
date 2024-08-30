package io.codeforall.bootcamp.harrypotter.controller.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String home() {

        return "home/home";
    }
}
