package kr.re.kitri.hello.model;

/**
 * Created by danawacomputer on 2017-06-13.
 */
public class Amigo {
    private int amigoid;
    private String name;
    private String phone;
    private String email;

    @Override
    public String toString() {
        return "Amigo{" +
                "amigoid=" + amigoid +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getAmigoid() {
        return amigoid;
    }

    public void setAmigoid(int amigoid) {
        this.amigoid = amigoid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
