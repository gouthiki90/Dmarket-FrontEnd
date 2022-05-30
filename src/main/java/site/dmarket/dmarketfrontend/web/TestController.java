package site.dmarket.dmarketfrontend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/main")
    public String main() {
        return "/post/main";
    }


    @GetMapping("/joinForm")
    public String joinForm() {
        return "/join/joinForm";
    }

<<<<<<< HEAD
    @GetMapping("/main")
    public String main() {
        return "/join/start";
    }
=======
>>>>>>> 63c7413eed818e7086494d97fbae48e1ed5eaca9
}
