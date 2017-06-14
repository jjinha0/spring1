package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by danawacomputer on 2017-06-14.
 */
public class TestArticleDao {

    private ApplicationContext context;


    //test전에 항상 실행되는 함수.(공통으로 반드시 실행되어야 하는 부분, 보통이름을 init)
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext(
                "classpath:spring/db.xml",
                "classpath:spring/applicationContext.xml");
    }

    @Test
    public void testGetSum(){
        ArticleDao dao = context.getBean("articleDao",ArticleDao.class);
        int result = dao.getSum(3,5);

        Assert.assertEquals(8,result); //결과가 8이면 test통과.
    }

    @Test
    public void testInsertArticle(){

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring/db.xml","classpath:spring/applicationContext.xml");
        ArticleDao dao = context.getBean("articleDao",ArticleDao.class); //첫글자만 소문자로 바꾸고 default가 이름이 똑같이 됨.
        dao.insertArticle(new Article());



    }
}
