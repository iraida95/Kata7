package kata7.application.swing;

public class Person {

    private final Integer id;
    private final String mail;

    public Person(Integer id, String mail) {
        this.id = id;
        this.mail = mail;
    }

    public Integer getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }
    
    
}
