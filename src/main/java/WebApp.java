import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class WebApp {

    @RequestMapping("/")
    String home() {
        return "Hello Arsène!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebApp.class, args);
    }

}