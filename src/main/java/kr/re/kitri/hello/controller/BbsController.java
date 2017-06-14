package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.common.MockArticle;
import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-12.
 */

//Controller를 만들면 1순위로 @Controller해주고 dispatcherServlet에 등록.
@Controller
public class BbsController {


    @Autowired
    private BbsService service;

    @RequestMapping("/bbs")
    public ModelAndView viewAll(){
        //전체보기를 하기 위한 데이터를 가져온다.(지금은 더미데이터사용)
        MockArticle mock = new MockArticle();
        List<Article> list = mock.getArticles();



        return new ModelAndView("bbs/view_all").addObject("list",list);
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
//            @RequestParam("myId") String myId,
//            @RequestParam("password") String password,
//            @RequestParam("title") String title,
//            @RequestParam("author") String author,
//            @RequestParam("content") String content
            Article article //위에처럼 여러번 하기 싫으니까 article이라는 model class만들어서 사용.
            ){
        System.out.println(article);

        /*BbsService service = new BbsService(); //비용이 쎈 new가 1회용처럼 사용되는 것을 막기위해 누가 managed(자동화,관리)해줬으면 좋겠다. -> Spring!!!
        BbsController에 member변수로 만들어준다 managed bean으로 만들기 위해서*/

        service.registArticle(article);


        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/write_text_do");
        mav.addObject("article",article); //자동적으로 jsp로 넘어간다.
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
