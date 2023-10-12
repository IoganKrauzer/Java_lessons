package OOP_Java.seminar_3_HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StreamService {
    


        private StreamOfStudents streamOfStudents;
    
        public void createStreamOfStudents(List<StudentGroup> studentGroup, int streamNumber) {
            this.streamOfStudents = new StreamOfStudents(studentGroup, streamNumber) ;
        }
    
 
    
        public StudentGroup getGroupFromStreamOfStudents(String name, int studentNumber){
            Iterator<StudentGroup> iterator = streamOfStudents.iterator();
            List<StudentGroup> result = new ArrayList<>();
            while (iterator.hasNext()){
                StudentGroup sGr = iterator.next();
                if(sGr.getName().equalsIgnoreCase(name)
                   && sGr.getStudentNumber() == studentNumber){
                    result.add(sGr);
                }
            }
            if(result.size() == 0){
                throw new IllegalStateException(
                        String.format("Группы с таким именем %s и количеством студентов %s не найдена", name, studentNumber)
                );
            }
            if(result.size() == 1){
                throw new IllegalStateException("Найдена группа с указынным именем и количеством студентов");
            }
            return result.get(0);
        }
    
        public List<StudentGroup> getSortedByNumberOfStudents(){
            List<StudentGroup> studentGr = new ArrayList<>(streamOfStudents.getStreamOfStudents());
            Collections.sort(studentGr);
            return studentGr;
        }
    
        public List<StudentGroup> getSortedByNumberOfStudentsAndName(){
            List<StudentGroup> studentGr = new ArrayList<>(streamOfStudents.getStreamOfStudents());
            studentGr.sort(new StreamComporator());
            return studentGr;
        }
    }

