package cn.saturdayramen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jiateng on 4/21/18.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Greeting from Spring Boot";
    }
}
