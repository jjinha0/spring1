package kr.re.kitri.hello.common;

import kr.re.kitri.hello.model.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-13.
 */
public class MockArticle {

    public List<Article> getArticles(){
        List<Article> list = new ArrayList<>();
        Article a = new Article();
        a.setArticleId("1");
        a.setTitle("1번 게시물입니다.");
        a.setAuthor("박찬호");
        a.setContent("박찬호는 한때 메이저리그에서 잘 했지.");
        list.add(a);


        a = new Article();
        a.setArticleId("2");
        a.setTitle("2번 게시물입니다.");
        a.setAuthor("박세리");
        a.setContent("박세리는 울마너라어라ㅣㅁ어.");
        list.add(a);


        a = new Article();
        a.setArticleId("3");
        a.setTitle("3번 게시물입니다.");
        a.setAuthor("스칼렛 요한슨");
        a.setContent("스칼렛요한슨 괜찮아요 우알어ㅏㅣ마어랑리");
        list.add(a);


        a = new Article();
        a.setArticleId("4");
        a.setTitle("4번 게시물입니다.");
        a.setAuthor("이순재");
        a.setContent("이순재할아버지 아ㅣ대ㅔㄴ러ㅏㅣㄴㅇ로.");
        list.add(a);



        a = new Article();
        a.setArticleId("5");
        a.setTitle("5번 게시물입니다.");
        a.setAuthor("에바 그린");
        a.setContent("에바 그린 존예에요.");
        list.add(a);

        return list;
    }

}
