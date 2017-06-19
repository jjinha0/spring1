package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Member;
import kr.re.kitri.hello.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



/**
 * Created by danawacomputer on 2017-06-16.
 */
@Controller
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;


    @GetMapping("/signup")
    public String signUp(){

        return "post/sign_up";

    }

    @PostMapping("/signup")
    public ModelAndView singUp(Member member){

        memberService.getSignUp(member);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("post/sign_up_ok");
        mav.addObject("member",member);
        return mav;

    }





}
