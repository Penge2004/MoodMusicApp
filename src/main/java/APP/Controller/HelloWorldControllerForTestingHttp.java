//package APP.Controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class HelloWorldControllerForTestingHttp {
//
//    @GetMapping("/")
//    public String homePage() {
//        return "helloWorld";  // This matches the helloWorld.html file in templates/
//    }
//
//    @PostMapping("/submitFeeling")
//    @ResponseBody
//    public String handleUserInput(@RequestParam("feeling") String userInput) {
//        System.out.println("User feeling " + userInput);
//        return "Thank you for submitting " + userInput;
//    }
//}
