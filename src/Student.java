public class Student {

    // Private fields store the information that belongs to each Student object.
    // Using private fields supports encapsulation by preventing direct access
    // to the data from outside the Student class.
    private String studentNumber;
    private String fullName;
    private String programme;
    private int yearOfStudy;

    // Constructor creates a Student object and gives its fields their starting values.
    public Student(String studentNumber, String fullName, String programme, int yearOfStudy) {
        this.studentNumber = studentNumber;
        this.fullName = fullName;
        this.programme = programme;
        this.yearOfStudy = yearOfStudy;
    }

    // Getters return the values stored in the private fields.
    public String getStudentNumber() {
        return studentNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getProgramme() {
        return programme;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    // Setters update the values stored in the private fields.
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    // Returns the Student object's information as a readable String.
    @Override
    public String toString() {
        return "Student Number: " + studentNumber
                + ", Full Name: " + fullName
                + ", Programme: " + programme
                + ", Year of Study: " + yearOfStudy;
    }

}
