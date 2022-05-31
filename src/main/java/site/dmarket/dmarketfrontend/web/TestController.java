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

    @GetMapping("/searchHome")
    public String searchHome() {
        return "/join/searchHomeForm";
    }
}
