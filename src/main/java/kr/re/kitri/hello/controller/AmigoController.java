package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.common.MockAmigo;
import kr.re.kitri.hello.model.Amigo;
import kr.re.kitri.hello.service.AmigoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * /amigo .. 친구 전체보기
 * /amigo/regist(GET) ..친구 등록화면으로 이동
 * /amigo/regist(POST) ..친구 등록
 * /amigo/{id} ..친구 상세보기
 * /amigo/{id}/modify(GET) ..친구 수정하기 화면으로 이동
 * /amigo/{id}/modify(POST) ..친구 수정하기
 * /amigo/{id}/remove(GET) ..친구 삭제하기
 */
@Controller
@RequestMapping("/amigo")
public class AmigoController {

    @Autowired
    private AmigoService service;

    @RequestMapping("")
    public ModelAndView amigoViewAll(){
        MockAmigo mock = new MockAmigo();
        List<Amigo> list = mock.getAmigo();
        return new ModelAndView("amigo/amigo_viewall").addObject("list",list);
    }


    @GetMapping("/regist")
    public String regist(){
        return "amigo/amigo_regist";
    }

    @RequestMapping("/{detailId}")
    public ModelAndView amigoDetail(@PathVariable("detailId") String detailId){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/amigo/amigo_detailId");
        mav.addObject("detailId",detailId);
        return mav;
    }


    @PostMapping("/regist")
    public ModelAndView registGo(
//            @RequestParam String name, //jsp의 변수명과 똑같으면 Param이름 생략가능. but, naming convention이 다르면 다르게 인식.
//                                 @RequestParam String phone,
//                                 @RequestParam String email
            Amigo amigo
    ){

        service.registAmigo(amigo);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("amigo/amigo_regist_ok");

        mav.addObject("amigo",amigo);
//        mav.addObject("name",name);
//        mav.addObject("phone",phone);
//        mav.addObject("email",email);

        return mav;
    }

}
