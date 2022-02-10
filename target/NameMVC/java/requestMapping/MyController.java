package requestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/")
public class MyController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String handler(@RequestParam("name") String name, Model model){
        String message = "Hello " + name;
        model.addAttribute("message", message);
        return "greetings";


    }


}
