package OOP_Java.seminar_3_HW;

import java.util.Comparator;

public class StudentGroup implements Comparable<StudentGroup>{

    private String name;
    private int studentNumber;

    public StudentGroup(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "GroupName = " + name + "\nStudentNumber = " + studentNumber;
    }


    @Override
    public int compareTo(StudentGroup o){
        if (this.studentNumber == o.studentNumber){
            return 0;
        }
        if (this.studentNumber < o.studentNumber){
            return -1;
        }
        return 1;
        
    }

    
}
