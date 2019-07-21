import school.*;
import util.*;
import java.util.*;

public class PrintReports{
    public static void main(String[] args){
        new PrintReports();
    }
    // Displayable student = null; 
    // Displayable teacher = null;   
    // Displayable roomClass = null;   
        ArrayList<Displayable> c = new ArrayList<Displayable>();
        ArrayList<Displayable> s = new ArrayList<Displayable>();
    public PrintReports(){
        char moreClass = 'y';

         do{
            Displayable roomClass = enterClassroom(); 
            c.add(roomClass);
            moreClass = KeyboardReader.getPromptedChar("Create more classrooms? (Y/N)");
        }while(moreClass != 'n' && moreClass != 'N');
        // s.add(enterClassroom());
        report(c);
    }
    public Displayable enterClassroom(){
            // Displayable classDisp = null;
         // Find out if i should only have one Diplayable object and store teacher, classroom and student in just 
        int roomNum = 0;
        char moreStudent = 'n';
    
        roomNum = KeyboardReader.getPromptedInt("Please provide class number: ");
            if(roomNum < 100){
                System.out.println("Enter a valid class number");
            }
            Displayable teacher = enterTeacher();
            c.add(teacher);
            do{
               Displayable student = enterStudent();
                s.add(student);
                moreStudent = KeyboardReader.getPromptedChar("Create more students? (Y/N)");
            }while(moreStudent != 'n' && moreStudent != 'N');
            // report(s);
        Displayable roomClass = new Classroom(roomNum, teacher, s);
    return roomClass;
    }

    public Displayable enterTeacher(){
        String teacherName = null;
        String teacherLast = null;
        String subject = null;

        teacherName = KeyboardReader.getPromptedString("Teacher's first name: ");
        teacherLast = KeyboardReader.getPromptedString("Last name: ");
        subject = KeyboardReader.getPromptedString("Subject: ");
        Displayable displayable = new Teacher(teacherName, teacherLast, subject);
        return displayable;
    }
    public Displayable enterStudent(){
        String studentName = null;
        String studentLast = null;
        int studentID = 0;
        int finalGrade = 0;

        studentID = KeyboardReader.getPromptedInt("Student ID: ");
        if(studentID < 0){
            System.out.println("Please enter a student ID greater than 0: ");
        }else{
            studentName = KeyboardReader.getPromptedString("Student's first name: ");
            studentLast = KeyboardReader.getPromptedString("Student's last name: ");
            finalGrade = KeyboardReader.getPromptedInt("Final grade: ");
        }
        Displayable displayableTwo = new Student(studentName, studentLast, studentID, finalGrade);
        return displayableTwo;
    }
    void report(ArrayList<Displayable> c){
		for (Displayable classroom : c ) {
            if(classroom instanceof Classroom){
                System.out.println("###########################");
                System.out.println(classroom.display());

                // for(int i = 0; i<classRoom.loopStudents.size; i++){
                //     loopStudents()[i].display();
                // }
                // ArrayList<Displayable> students = classroom.loopStudents();
                // for(Displayable eachStudent : students){
                //     // if(eachStudent instanceof Student){
                //     //     System.out.println(eachStudent.display());
                //     // }
                // } 
                System.out.println("###########################");
            }
        }

        // System.out.println("Report is reporting");
    }
}