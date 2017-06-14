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
//        return "redirect:bbs/"; //web에서 network보면 status code가 302(redirect뜸).

        return "index";
    }



//    @RequestMapping("/bs-sample")
//    public String test() {
//        return "bs_sample";
//    }

}
