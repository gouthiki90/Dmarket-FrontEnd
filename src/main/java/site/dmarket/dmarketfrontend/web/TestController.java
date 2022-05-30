package site.dmarket.dmarketfrontend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/joinForm")
    public String joinForm() {
        return "/join/joinForm";
    }

    @GetMapping("/main")
    public String main() {
        return "/join/start";
    }
}
