package OOP_Java.seminar_3_HW;

import java.util.Comparator;

public class StreamComporator implements Comparator<StudentGroup> {

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {


        int resultOfComparing = o1.getStudentNumber() - (o2.getStudentNumber());

        if (resultOfComparing == 0) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return resultOfComparing;
        }
    }

}
