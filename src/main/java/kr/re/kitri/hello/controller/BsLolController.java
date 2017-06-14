package kr.re.kitri.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by danawacomputer on 2017-06-13.
 */
@Controller
public class BsLolController {

    @RequestMapping("/bs-sample")
    public String bsLol(){

        return "bslol/bs_sample";

    }

    @RequestMapping("/bs-write")
    public String bsWrite(){

        return "bslol/bs_write";

    }

    @RequestMapping("/bs-read/{bsnum}")
    public ModelAndView bsRead(@PathVariable("bsnum") String bsnum){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("bslol/bs_read");
        mav.addObject("bsnum",bsnum);
        return mav;
    }


}
