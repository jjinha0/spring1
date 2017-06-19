package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * /api/bbs             (GET) ..전체보기
 * /api/bbs/{articleId} (GET) ..상세보기
 * /api/bbs             {POST} ..글쓰기
 * /api/bbs/{articleId} (PUT) ..글수정
 * /api/bbs/{articleId} (DELETE) ..글삭제
 *
 */
@RestController //모든 response가 json! 이 한줄로 @ResponseBody안써줘도됨
@RequestMapping("/api/bbs")
public class ApiBbsController {

    @Autowired
    private BbsService service;


    @GetMapping("")
    public List<Article> viewAll(){
        List<Article> list = service.getArticles();
        return list;
    }


    @GetMapping("/{articleId}")
    public Article viewDetail(@PathVariable String articleId){

        Article article = service.viewArticle(articleId);
        return article;

    }

    @PostMapping("")
    public void regist(@RequestBody Article article){
        service.registArticle(article);
    }

    @PutMapping("/{articleId}")
    public  void modify(@PathVariable String articleId, @RequestBody Article article){
        service.modifyArticle(articleId, article);
    }

    @DeleteMapping("/{articleId}")
    public void remove(@PathVariable String articleId){

        service.removeArticle(articleId);

    }



}
