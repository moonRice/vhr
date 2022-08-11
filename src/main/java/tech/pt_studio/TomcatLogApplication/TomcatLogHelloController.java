package tech.pt_studio.TomcatLogApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomcatLogHelloController {
    @GetMapping("/tHi")
    public String tomcatLogHello(){
        return "TomcatLogApplication";
    }
}
