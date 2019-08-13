package maincreators.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;
@Controller
public class MaincreatorsController {
    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        return "maincreators";
    }
}
