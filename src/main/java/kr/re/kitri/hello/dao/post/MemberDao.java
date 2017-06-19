package kr.re.kitri.hello.dao.post;

import kr.re.kitri.hello.model.Member;
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
public class MemberDao implements IMemberDao {

    @Autowired
    private DataSource dataSource;



    public void updatePoint(String memberId) {

        try {

            Connection conn = dataSource.getConnection();
            System.out.println("connect ok");

            String query = "UPDATE member set point = (point + 10) where member_seq = '1'";
            PreparedStatement pstmt = conn.prepareStatement(query);


            pstmt.executeUpdate();

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
