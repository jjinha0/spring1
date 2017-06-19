package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.post.SignupDao;
import kr.re.kitri.hello.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by danawacomputer on 2017-06-16.
 */
@Service
public class MemberService {
    @Autowired
    private SignupDao Dao;

    public void getSignUp(Member member) {

        Dao.signUpPage(member);

    }
}

