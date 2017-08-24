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

    @RequestMapping("/Bankaccounts")
    public String showMArrayList(Model model) {
        List<BankAccount> myArrayList = new ArrayList<>();
        myArrayList.add(new BankAccount("Sarabi", 4000, "lion", true, false));
        myArrayList.add(new BankAccount("Nala", 2300, "lion", true, false));
        myArrayList.add(new BankAccount("Pumbaa", 300, "pig", false, true));
        myArrayList.add(new BankAccount("Timon", 400, "surikata", false, true));
        model.addAttribute("MyArrayList", myArrayList);
        model.addAttribute("goodguy","goodguy");
        model.addAttribute("badguy","badguy");
        return "array";
    }






