package kr.re.kitri.hello.dao.post;

import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by danawacomputer on 2017-06-16.
 */
@Repository
public class PostDao implements IPostDao{

    @Autowired
    private DataSource dataSource;

    public void insertPost(Post post) {

        try {

            Connection conn = dataSource.getConnection();
            System.out.println("connect ok");

            String query = "insert into post(post_seq, title, content, write_date, member_seq) VALUES (?, ?, ?, now(), '2')";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setInt(1,Integer.parseInt(post.getPostId()));
            pstmt.setString(2,post.getTitle());
            pstmt.setString(3,post.getContent());


            pstmt.executeUpdate();

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
