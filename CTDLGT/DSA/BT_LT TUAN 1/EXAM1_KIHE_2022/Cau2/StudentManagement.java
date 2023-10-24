import java.util.*;
public class StudentManagement {
    private MyLinkedList<Student> stuList;

    public StudentManagement(){
        stuList = new MyLinkedList<Student>();
    }

    public void addStudent(Student stu){
        stuList.addFirst(stu);
    }

    public String firstMaxGPAStudent(){
        if(stuList.getHead() == null){
            return "";
        }
        //SV code them tai day va co the thay doi gia tri return ben duoi cho phu hop
        else{
            Node<Student> current = stuList.getHead();
            Node<Student> studentmax = stuList.getHead();
            while (current != null){
                if (current.getData().getGPA() > studentmax.getData().getGPA()){
                    studentmax = current;
                }
                current =current.getNext();
            }
            return studentmax.getData().getName();
        }
    }
}
