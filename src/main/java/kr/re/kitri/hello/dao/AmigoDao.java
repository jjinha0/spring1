package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Amigo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by danawacomputer on 2017-06-15.
 */
@Repository
public class AmigoDao {
    @Autowired
    private DataSource dataSource;


    public void insertAmigo(Amigo amigo){
        try {
            Connection conn = dataSource.getConnection();
            System.out.println("connection ok");

            String query = "insert into amigo(name, phone, email) VALUES (?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1,amigo.getName());
            pstmt.setString(2,amigo.getPhone());
            pstmt.setString(3,amigo.getEmail());

            pstmt.executeUpdate();

            conn.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
