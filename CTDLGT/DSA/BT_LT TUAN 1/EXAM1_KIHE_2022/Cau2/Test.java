public class Test {
    public static void main(String[] args){
        StudentManagement stu = new StudentManagement();
        stu.addStudent(new Student("Alex",5.0));
        stu.addStudent(new Student("Bob",2.0));
        stu.addStudent(new Student("Kevin",9.3));
        stu.addStudent(new Student("Lisa",1.5));
        System.out.println(stu.firstMaxGPAStudent());
    }
}
   

