package lab13;
public class Main {
    public static void main(String[] args) {
        ModuleScore test = new ModuleScore();
        Student andrew = new Student(1808097, "Andrew", 19990421);
        Student hellen = new Student(1706058, "Hellen", 19981129);   
        
        test.addStudent(andrew);
        test.addStudent(hellen);
        
        test.printout();
    }
}
