package OOP_Java.seminar_3;

import java.util.List;

public class StudentGroup {
    private List<Student> studentList;
    private Teacher teacher;

 

    public StudentGroup(List<Student> studentList, Teacher teacher) {
        this.studentList = studentList;
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudentGroup { studentList=" + studentList + 
        ", teacher=" + teacher + " }";
    }

   

    
}