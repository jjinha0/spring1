package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-14.
 */
public class ArticleDaoTest {

    private ApplicationContext context;


    //test전에 항상 실행되는 함수.(공통으로 반드시 실행되어야 하는 부분, 보통이름을 setup,init)
    @Before
        public void setup(){
            context = new ClassPathXmlApplicationContext(
                    "classpath:spring/db.xml",
                    "classpath:spring/applicationContext.xml");
        }

        @Test
        public void testSelectArticleById(){

            ArticleDao dao = context.getBean("articleDao", ArticleDao.class);
            Article article = dao.selectArticleById("2");
            Assert.assertTrue(article.getAuthor().equals("lee"));
        }


        @Test
        public void testSelectAllArticles(){
            ArticleDao dao = context.getBean("articleDao", ArticleDao.class);
            List<Article> list = dao.selectAllArticles();
            Assert.assertTrue(list.size() > 0);
            System.out.println(list.size());
            Assert.assertTrue(list.get(0).getAuthor().equals("kim"));
        }



    @Test
    public void testInsertArticle(){


        ArticleDao dao = context.getBean("articleDao",ArticleDao.class); //첫글자만 소문자로 바꾸고 default가 이름이 똑같이 됨.

        Article article = new Article();
        article.setArticleId("3");
        article.setPassword("adfasdf");
        article.setTitle("테스트케이스");
        article.setAuthor("tc");
        article.setContent("테스트케이스 입니다.");


        dao.insertArticle(article);



    }
}
