package OOP_Java.seminar_3_HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        test1();
 
    }



    public static void test1() {
        StudentGroup gr1 = new StudentGroup("1", 14);
        StudentGroup gr2 = new StudentGroup("2", 24);
        StudentGroup gr3 = new StudentGroup("3", 44);
        StudentGroup gr4 = new StudentGroup("4", 84);
        StudentGroup gr5 = new StudentGroup("5", 33);
        StudentGroup gr6 = new StudentGroup("6", 22);
        StudentGroup gr7 = new StudentGroup("7", 64);

        List<StudentGroup> studentGroup = new ArrayList<>(
                List.of(new StudentGroup[] { gr1, gr2, gr3, gr4, gr5, gr6, gr7 }));

        System.out.println("\n----------------------");

        for (StudentGroup item : studentGroup) {

            System.out.println(item);
            System.out.println("----------------------");

        }
        System.out.println("---S--O--R--T--E--D---");
        System.out.println("----------------------");
        Collections.sort(studentGroup);
        for (StudentGroup s : studentGroup) {
            System.out.println(s);
            System.out.println("----------------------");
        }
        System.out.println("--------F--I--N-------");
        System.out.println("----------------------");
    }

}
