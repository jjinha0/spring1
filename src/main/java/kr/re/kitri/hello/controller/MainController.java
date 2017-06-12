package kr.re.kitri.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by danawacomputer on 2017-06-09.
 */

@Controller
public class MainController {
//실제 entry point!! MainController/HomeController/IndexController로 보통 naming!! -> Landing page가 포함된 controller구나

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/test")
    public String test() { return "test"; }

}
