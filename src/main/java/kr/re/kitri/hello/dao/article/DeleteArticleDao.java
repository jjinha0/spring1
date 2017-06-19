package kr.re.kitri.hello.dao.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by danawacomputer on 2017-06-19.
 */
@Repository
public class DeleteArticleDao implements IDeleteArticleDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void deleteArticle(String articleId){
        String query = "delete from article where articleid =?";
        jdbcTemplate.update(query,
                Integer.parseInt(articleId));
    }




}
