package homepage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("LoginRequest") LoginRequest loginRequest, Model model) {
        if ("right".equals(loginRequest.getUsername())) {
            model.addAttribute("username", loginRequest.getUsername());
            return "success";
        } else {
            return "failed";
        }
    }


}
