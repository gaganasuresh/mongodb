package junit.testing12;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testing")
public class helloresource {
    @GetMapping
    public String Junit(){
        return "JUnit Testing";
    }
    @PostMapping(value = "/testingpost")
    public


}
