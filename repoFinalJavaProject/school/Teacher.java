package school;
import util.*;

public class Teacher extends Person implements Displayable{
    private String subject;

    public Teacher(){
    }

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Teacher(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        setSubject(subject);
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject(){ return subject; }

    public String display() {
        return getFullName() + " teaches " + getSubject();
    }
}