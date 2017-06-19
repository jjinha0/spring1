package kr.re.kitri.hello.dao.article;

import kr.re.kitri.hello.model.Article;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
public interface ArticleDao {

    void insertArticle(Article article);
    Article selectArticleById(String articleId);
    List<Article> selectAllArticles();


}
