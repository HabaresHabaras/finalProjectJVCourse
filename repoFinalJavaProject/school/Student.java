package school;
import util.*;

public class Student extends Person implements Displayable{

    private int studentId;
    private int finalGrade;

    public Student(){
    }

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Student(String firstName, String lastName, int studentId, int finalGrade){
        super(firstName, lastName);
        setStudentId(studentId);
        setFinalGrade(finalGrade);
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setFinalGrade(int finalGrade) {
        this.finalGrade = finalGrade;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getFinalGrade() {
        return finalGrade;
    }

    public String display() {
        return "STUDENT ID: " + getStudentId() + " " + getFullName() + " Final Grade: " + getFinalGrade();
    }
}