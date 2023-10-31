package ObjectAndClasses.Exercises.Students_04;

public class Student {

    private String firstName;
    private String lastName;

    private double grade;

    public Student(String firstName,String lastName, double grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName(){
       return this.firstName;
    }
    public String getLastName(){
        return  this.lastName;
    }

    public double getGrade(){
        return this.grade;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
}
