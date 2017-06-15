package kr.re.kitri.hello.service;


import kr.re.kitri.hello.dao.ArticleDao;
import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-14.
 */
//기능을 수행하는 클래스. 각 메소드는 해당 기능을 수행한다.
    @Service //관리받는 대상이다!라고 마킹
public class BbsService {
        @Autowired
        private ArticleDao dao;

    //글쓰기. @param article.
    public void registArticle(Article article) {

        dao.insertArticle(article); //암기 할 필요가 있음
    }



    //상세 글 보기. @param articleId글번호. @return 글.
    public Article viewArticle(String articleId){

        return dao.selectArticleById(articleId);
    }


    //글 전체 보기. @return 전체 글.
    public List<Article> getArticles(){

        return dao.selectAllArticles();
    }
}
