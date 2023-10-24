public class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName(){
        return this.name;
    }

    public double getGPA(){
        return this.gpa;
    }

    public String toString(){
        return this.name + "_" + this.gpa;
    }
}
