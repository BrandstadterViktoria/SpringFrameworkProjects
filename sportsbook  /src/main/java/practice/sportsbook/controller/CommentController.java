package practice.sportsbook.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommentController {

    @GetMapping("/")
    public String index () {
        return "index";
    }



}
