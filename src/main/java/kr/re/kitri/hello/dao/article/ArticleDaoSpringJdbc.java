package kr.re.kitri.hello.dao.article;

import kr.re.kitri.hello.dao.article.ArticleDao;
import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
@Repository
public class ArticleDaoSpringJdbc implements ArticleDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertArticle(Article article) {

        String query =
                "insert into article (articleid, password, title, author, content)\n" +
                        "VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(
                query,
                Integer.parseInt(article.getArticleId()),
                article.getPassword(),
                article.getTitle(),
                article.getAuthor(),
                article.getContent());
    }


    @Override
    public Article selectArticleById(String articleId) {

        String query = "SELECT articleid, password, title, author, content from article where articleid = ?";

        return jdbcTemplate.queryForObject(query,
                (rs, i) -> {
                Article article = new Article();
                article.setArticleId(rs.getString(1)); //getString으로 자동 바꿔줌
                article.setPassword(rs.getString(2));
                article.setTitle(rs.getString(3));
                article.setAuthor(rs.getString(4));
                article.setContent(rs.getString(5));

                return article;
            },Integer.parseInt(articleId)); //Lambda식으로 표현.
    }

    @Override
        public List<Article> selectAllArticles() {
            String query = "select articleid, password, title, author, content from article";

            return jdbcTemplate.query(query, new RowMapper<Article>() {
                @Override
                public Article mapRow(ResultSet rs, int i) throws SQLException {
                    Article article = new Article();
                    article.setArticleId(rs.getString(1));
                    article.setPassword(rs.getString(2));
                    article.setTitle(rs.getString(3));
                    article.setAuthor(rs.getString(4));
                    article.setContent(rs.getString(5));
                    return article;
                }
            });






    }
}