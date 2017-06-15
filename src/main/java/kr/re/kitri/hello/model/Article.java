package kr.re.kitri.hello.model;

/**
 * Created by danawacomputer on 2017-06-12.
 */
public class Article {

    //html의 name과 일치해야 자동으로 넣어줌
    private String articleId;
    private String password;
    private String title;
    private String author;
    private String content;

    @Override
    public String toString() {
        return "Article{" +
                "myId='" + articleId + '\'' +
                ", password='" + password + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String myId) {
        this.articleId = myId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
