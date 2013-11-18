package biz.ezcom.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = { "/interceptor" })
public class InterceptorController {
    @RequestMapping(value = { "/input" }, method = { RequestMethod.GET })
    public String input() {
        System.out.println("Controller====================");
        return "/interceptor/input";
    }
}
