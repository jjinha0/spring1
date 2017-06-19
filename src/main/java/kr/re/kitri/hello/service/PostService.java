package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.post.MemberDao;
import kr.re.kitri.hello.dao.post.PostDao;
import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by danawacomputer on 2017-06-16.
 */

@Service
public class PostService {
    @Autowired
    private MemberDao memberDao;
    @Autowired
    private PostDao postDao;

//    글 등록하고, 멤버의 포인트를 (10)점 더해준다.
    public void registPost(Post post){
        //두개의 테이블을 트랜잭션 처리를 해야하는데 Spring의 경우엔 트랜잭션을 알아서 처리해줌(Bean설정파일에 설정만 해주면 됨).
        postDao.insertPost(post);
        memberDao.updatePoint(post.getMemberId());

        //Dao두개 묶은 이부분이 트랜잭션 처리.
    }


}
