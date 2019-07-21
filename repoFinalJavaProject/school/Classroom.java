package school;
import util.*;
import java.util.*;
public class Classroom implements Displayable{

    private int roomNumber;
    private Displayable teacher;
    private ArrayList<Displayable> students;

    public Classroom(){
    };

    public Classroom(int roomNumber, Displayable teacher, ArrayList<Displayable> students){
        this.roomNumber = roomNumber;
        this.teacher = teacher;
        this.students = students;
    }

    public ArrayList<Displayable> loopStudents(){

        return students;
    }


    public String display() {
        return roomNumber + " class " + teacher.display();
    }
}