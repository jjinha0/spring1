package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.common.MockAmigo;
import kr.re.kitri.hello.model.Amigo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-12.
 */
@Controller
public class AmigoController {

    @RequestMapping("/amigo/viewall")
    public ModelAndView amigoViewAll(){
        MockAmigo mock = new MockAmigo();
        List<Amigo> list = mock.getAmigo();
        return new ModelAndView("amigo/amigo_viewall").addObject("list",list);
    }

    @RequestMapping(value = "/amigo/regist", method = RequestMethod.GET)
    public String regist(){
        return "amigo/amigo_regist";
    }

    @RequestMapping("/amigo/{detailId}")
    public ModelAndView amigoDetail(@PathVariable("detailId") String detailId){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/amigo/amigo_detailId");
        mav.addObject("detailId",detailId);
        return mav;
    }


    @RequestMapping(value = "/amigo/regist", method = RequestMethod.POST)
    public ModelAndView registGo(@RequestParam String name, //jsp의 변수명과 똑같으면 Param이름 생략가능. but, naming convention이 다르면 다르게 인식.
                                 @RequestParam String phone,
                                 @RequestParam String email){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("amigo/amigo_regist_go");

        mav.addObject("name",name);
        mav.addObject("phone",phone);
        mav.addObject("email",email);

        return mav;
    }

}
