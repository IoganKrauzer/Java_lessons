package OOP_Java.seminar_3_HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StreamOfStudents implements Iterable<StudentGroup> {

    private List<StudentGroup> streamOfStudents;
    private int streamNumber;

    public StreamOfStudents(List<StudentGroup> streamOfStudents, int streamNumber) {
        this.streamOfStudents = streamOfStudents;
        this.streamNumber = streamNumber;
    }

    @Override
    public Iterator<StudentGroup> iterator() {

        return streamOfStudents.iterator();
    }

    public List<StudentGroup> getStreamOfStudents() {
        return streamOfStudents;
    }

    public void setStreamOfStudents(List<StudentGroup> streamOfStudents) {
        this.streamOfStudents = streamOfStudents;
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    public void setStreamNumber(int streamNumber) {
        this.streamNumber = streamNumber;
    }

}
