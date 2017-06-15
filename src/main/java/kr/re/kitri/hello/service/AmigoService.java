package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.AmigoDao;
import kr.re.kitri.hello.model.Amigo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-15.
 */
@Service
public class AmigoService {
    @Autowired
    private AmigoDao dao;

    public void registAmigo(Amigo amigo){

        dao.insertAmigo(amigo);

    }

    public List<Amigo> viewAmigo(){

        return null;
    }


}
