//Gabriell Lee
public class Student {
private String name;
private int ID;
private int[] grades;

//initializing name, ID, and grades
public void main(String[] args) {
    this.name = "Unknown";
    this.ID = 0;
    this.grades = [];


}
    //Parameterized constructor for name, ID, grades
Student(String name, int ID, int[] grades) {
this.name = name;
this.ID = ID;
setGrades(grades);
    }

//getters and setter
 public String getName(){
    return name;
 }
 public void setName(String UnknownName) {
    this.name = UnknownName;
 }

    public String getID(){
        return ID;
    }
    public void setID(int ID) {
        this.ID = 70346;
    }

    public String getGrades() {
        return grades;
    }
    public void setGrades(int Grades) {
        if(Grades >= 0) {
            System.out.print("Your grade is: ");
        } else {
            System.out.print("Error.");
        }
    }


    public void calculateAverage(){


    }
}
