package.com.example.demo.controller

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping

@Controller
public class BankAccountController {


    @RequestMapping("/Exercise1")
    public String showBankAccountDetails(Model model) {

        return "ExerciseHTML";
    }




