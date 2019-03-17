package lab13;
import java.util.*;
public class ModuleScore {
    Scanner in = new Scanner(System.in);
    
    private ArrayList<Student> students;
    private ArrayList<int[]> grades;
    public ModuleScore(){
        students = new ArrayList<Student>();
        grades = new ArrayList<int[]>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
    public ArrayList<int[]> getGrades() {
        return grades;
    }
    
    public void addStudent(Student student){
        int [] marks = new int[5]; 
        for(int i=0;i<marks.length;i++){
            System.out.println("Please enter the students grade for test #" + (i+1));
            marks[i] = in.nextInt();
        }
        getGrades().add(marks);
        getStudents().add(student);
    }
    
    public void printout(){
        for(int i=0;i<getStudents().size();i++){
            System.out.println(getStudents().get(i).toString());
            System.out.print("Grades: ");
            for(int j=0;j<5;j++){
                System.out.print(getGrades().get(i)[j] + " ");
            }
        }
    }
}
