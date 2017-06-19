package kr.re.kitri.hello.dao.article;

import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by danawacomputer on 2017-06-19.
 */
@Repository
public class ModifyArticleDao implements IModifyArticleDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void modifyArticle(String articleId, Article article){
        String query = "update article set title = ? where articleid = ?";
        jdbcTemplate.update(
                query,
                article.getTitle(),
                Integer.parseInt(articleId));

    }
    }

