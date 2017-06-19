package kr.re.kitri.hello.dao.article;

import kr.re.kitri.hello.model.Article;

/**
 * Created by danawacomputer on 2017-06-19.
 */
public interface IModifyArticleDao {
    void modifyArticle(String articleId, Article article);

}
