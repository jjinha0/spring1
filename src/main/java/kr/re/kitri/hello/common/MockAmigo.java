package kr.re.kitri.hello.common;

import kr.re.kitri.hello.model.Amigo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-13.
 */
public class MockAmigo {
        public List<Amigo> getAmigo() {
            List<Amigo> list = new ArrayList<>();
            Amigo a = new Amigo();
            a.setName("jhy");
            a.setPhone("010-1234-1234");
            a.setEmail("ddd@dk.dk");
            list.add(a);

            a = new Amigo();
            a.setName("hyj");
            a.setPhone("010-4321-1234");
            a.setEmail("qwe@dk.dk");
            list.add(a);

            return list;
    }
}
