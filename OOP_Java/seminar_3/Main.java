package OOP_Java.seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    Student student1 = new Student("1", "1", "1", "1.1.1", 111L);
    Student student2 = new Student("2", "2", "2", "2.2.2", 222L);
    Student student3 = new Student("3", "3", "3", "3.3.3", 333L);
    Student student4 = new Student("4", "4", "4", "4.4.4", 444L);
    Teacher teacher5 = new Teacher("5", "5", "5", "5.5.5", 555L);

    List<Student> studentList = List.of(new Student[] { student1, student2, student3, student4 });
    public void main(String[] args) {


        StudentGroupIterator sgi = new StudentGroupIterator(studentList);

        // sgi.next();
        // sgi.remove();
        // sgi.zeroCounter();

        StudentGroup studentGroup = new StudentGroup(studentList, teacher5);

        System.out.println("-------------------------");
        for (Student i : studentGroup) {
            System.out.println(i);
            System.out.println("-------------------------");
        }
   

    test();
    }
    
    public void test() {

        Collections.sort(this.studentList);
        for (Student s: studentList){
            System.out.println(s);
        }
    }

    // ------------------------------------------------------------
    // System.out.println("-------------------------");
    // while (sgi.hasNext()) {

    // System.out.println(sgi.next());
    // System.out.println("-------------------------");
    // }
    // ------------------------------------------------------------

}
