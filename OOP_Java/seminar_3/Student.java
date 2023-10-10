package OOP_Java.seminar_3;



public class Student extends User{
    private Long studentId;

    public Student(String firstName, String secondName, String lastName, String dateOfBirth, Long studentId) {
        super(firstName, secondName, lastName, dateOfBirth);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student { " +
        "First name: " + super.getFirstName() + " / " +
        "Second name: " + super.getSecondName() + " / " +
        "Last name: " + super.getLastName() + " / " +
        "Date of birth: " + super.getDateOfBirth() + " / " +
        "Student id: " + studentId + " }";
    }
        
        
        
 


    


    
}
