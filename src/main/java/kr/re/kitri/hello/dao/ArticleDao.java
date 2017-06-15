package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-14.
 */
@Repository
public class ArticleDao {
    @Autowired
    private DataSource dataSource;

    public int getSum(int a, int b) {
        return a + b;
    }

    //실제로 데이터베이스에 insert.
    public void insertArticle(Article article) {

        try {
            //1.connection확보
            Connection conn = dataSource.getConnection();
            System.out.println("connect ok");

            //2.쿼리를 생성 - PreparedStatement생성
            String query = "insert into article(articleid, password, title, author, content) " +
                    "VALUES (?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1,Integer.parseInt(article.getArticleId()));
            pstmt.setString(2,article.getPassword());
            pstmt.setString(3,article.getTitle());
            pstmt.setString(4,article.getAuthor());
            pstmt.setString(5,article.getContent());

            pstmt.executeUpdate();

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }




        }
        public List<Article> selectAllArticles(){
            String query = "select articleid, password, title, author, content from article;";

            try {

                Connection conn = dataSource.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query);
                ResultSet rs = pstmt.executeQuery();

                List<Article> list = new ArrayList<>();
                Article article;
                while (rs.next()) {
                    article = new Article();
                    article.setArticleId(rs.getString(1));
                    article.setPassword(rs.getString(2));
                    article.setTitle(rs.getString(3));
                    article.setAuthor(rs.getString(4));
                    article.setContent(rs.getString(5));

                    list.add(article);

                }
                conn.close();
                return list;

            } catch (SQLException e) {
                e.printStackTrace();
                return new ArrayList<>();
            }

        }

    /*글 상세보기 @param articleId 글번호*/
    public Article selectArticleById(String articleId) {
        String query = "select articleid, password, title, author, content from article where articleId = ?;";

        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1,Integer.parseInt(articleId));
            ResultSet rs = pstmt.executeQuery();
            rs.next();

            Article article = new Article();
            article.setArticleId(rs.getString(1));
            article.setPassword(rs.getString(2));
            article.setTitle(rs.getString(3));
            article.setAuthor(rs.getString(4));
            article.setContent(rs.getString(5));

            conn.close();
            return article;
        } catch (SQLException e) {
            e.printStackTrace();
            return new Article();
        }

    }
}
