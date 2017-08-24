package.com.example.demo.controller

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping

@Controller
public class BankAccountController {
    @RequestMapping("/Exercise1")
    public String showBankAccountDetails(Model model) {
        public String showBankAccountDetails(Model model) {
            BankAccount lionKing = new BankAccount("Simba", 2000, "lion", true, false);
            model.addAttribute("name", lionKing.getName());
            model.addAttribute("balance", lionKing.getBalance());
            model.addAttribute("animalType", lionKing.getAnimalType());
        }
        return "ExerciseHTML";
    }

    @RequestMapping("/Exercise1Endpoint2")
    public String returnSubmitHtml(Model model) {
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "Submit";
    }





