package lab13;
public class Student {
    private int matriculationNumber;
    private String name;
    private int dateOfBirth;
    public Student(int matriculationNumber, String name, int dateOfBirth){
        this.matriculationNumber=matriculationNumber;
        this.name=name;
        this.dateOfBirth=dateOfBirth;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }
    public void setMatriculationNumber(int matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public String toString(){
        return "Name: " + getName() + "\nMatriculation number: " + getMatriculationNumber() + "\nDate of birth: " + getDateOfBirth();
    }
}
