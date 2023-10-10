package OOP_Java.seminar_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("1", "1", "1", "1.1.1", 111L);
        Student student2 = new Student("2", "2", "2", "2.2.2", 222L);
        Student student3 = new Student("3", "3", "3", "3.3.3", 333L);
        Student student4 = new Student("4", "4", "4", "4.4.4", 444L);
        Teacher teacher5 = new Teacher("5", "5", "5", "5.5.5", 555L);

        List<Student> studentList = List.of(new Student[] { student1, student2, student3, student4 });
        StudentGroupIterator sgi = new StudentGroupIterator(studentList);
        System.out.println("-------------------------");
        while (sgi.hasNext()) {

            System.out.println(sgi.next());
            System.out.println("-------------------------");
        }

    }
}
