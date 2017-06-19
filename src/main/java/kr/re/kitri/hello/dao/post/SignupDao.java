package kr.re.kitri.hello.dao.post;

import kr.re.kitri.hello.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by danawacomputer on 2017-06-19.
 */
@Repository
public class SignupDao {

    @Autowired
    private DataSource dataSource;

    public void signUpPage(Member member) {
        try {

            Connection conn = dataSource.getConnection();
            System.out.println("connect ok");

            String query = "insert into member(userid, password, email, join_date) VALUES (?, ?, ?, now())";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1,member.getUserId());
            pstmt.setString(2,member.getPassword());
            pstmt.setString(3,member.getEmail());


            pstmt.executeUpdate();

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
