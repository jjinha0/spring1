package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by danawacomputer on 2017-06-12.
 */

//Controller를 만들면 1순위로 @Controller해주고 dispatcherServlet에 등록.
@Controller
public class BbsController {
    @RequestMapping("/bbs")
    public String viewAll(){
        return "bbs/view_all";
//      ->views directory에 view_all.jsp파일 만들어준다.
    }

    @RequestMapping("/bbs/{articleId}")//url에 변수 자체를 사용하기 위함.
    public ModelAndView viewDetail(@PathVariable("articleId") String articleId){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/view_detail");
        mav.addObject("articleId",articleId);
        return mav;
    }


    @RequestMapping(value = "/bbs/write", method = RequestMethod.GET)
    public String loadWrite(){
        return "bbs/load_write";
    }

    //요즘엔 다 이렇게 짬.
    @RequestMapping(value = "/bbs/write", method = RequestMethod.POST)
    public ModelAndView writeText(
//            @RequestParam("id") String Id,
//            @RequestParam("password") String password,
//            @RequestParam("title") String title,
//            @RequestParam("author") String author,
//            @RequestParam("content") String content
            Article article //위에처럼 여러번 하기 싫으니까 article이라는 model class만들어서 사용.
            ){

        System.out.println(article);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/write_text_do");
        mav.addObject("article",article);
//        mav.addObject("myId",myId);
//        mav.addObject("password",password);
//        mav.addObject("title",title);
//        mav.addObject("author",author);
//        mav.addObject("content",content);
        return mav;

    }
    //좀 오래된 방식.
//    @RequestMapping("/bbs/write/do")
//    public String writeText(HttpServletRequest request){
//        String myId = request.getParameter("myid");
//        String password = request.getParameter("password");
//        String title = request.getParameter("title");
//        String author = request.getParameter("author");
//        String content = request.getParameter("content");
//
//        System.out.println(myId);
//        System.out.println(password);
//        System.out.println(title);
//        System.out.println(author);
//        System.out.println(content);
//        return "write_text_do";
//    }
}
