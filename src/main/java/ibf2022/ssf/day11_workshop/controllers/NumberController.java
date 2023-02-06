package ibf2022.ssf.day11_workshop.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path={"/number"})
public class NumberController {

    @GetMapping
    public String getNumber(Model model) {

        Random rand =  new Random();
        Integer guessNumber = rand.nextInt(31);

        // System.out.printf("The number is %d\n", guessNumber);

        String imgAddress = "/images/number" + guessNumber.toString() + ".jpg";

        model.addAttribute("number", imgAddress);

        return "number";

    }  
}
