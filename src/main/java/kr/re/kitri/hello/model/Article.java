package kr.re.kitri.hello.model;

/**
 * Created by danawacomputer on 2017-06-12.
 */
public class Article {

    private String myId;
    private String password;
    private String title;
    private String author;
    private String content;

    @Override
    public String toString() {
        return "Article{" +
                "myId='" + myId + '\'' +
                ", password='" + password + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getMyId() {
        return myId;
    }

    public void setMyId(String myId) {
        this.myId = myId;
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
