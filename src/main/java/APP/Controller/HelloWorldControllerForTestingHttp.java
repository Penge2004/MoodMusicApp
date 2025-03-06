package APP.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControllerForTestingHttp {

    @RequestMapping
    public String helloWorld() {
        return "Hello World from Spring boot";
    }
}
