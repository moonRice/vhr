package tech.pt_studio.ThymeleafApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/thymeleafIndex")
    public String thymeleafIndexShow(Model model) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User u = new User();
            u.setId(i);
            u.setUsername("Tom" + i);
            u.setAddress("pt_studio.tech - " + i);
            users.add(u);
        }
        model.addAttribute("users", users);
        return "thymeleafIndex";
    }
}
