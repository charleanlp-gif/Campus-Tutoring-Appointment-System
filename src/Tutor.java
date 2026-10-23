public class Tutor {

    // Private fields store the information that belongs to each Tutor object.
    // Using private fields supports encapsulation by preventing direct access
    // to the data from outside the Tutor class.
    private String tutorId;
    private String fullName;
    private String subjectArea;
    private int maxAppointmentsPerDay;

    // Constructor creates a Tutor object and gives its fields their starting values.
    public Tutor(String tutorId, String fullName, String subjectArea, int maxAppointmentsPerDay) {
        this.tutorId = tutorId;
        this.fullName = fullName;
        this.subjectArea = subjectArea;
        this.maxAppointmentsPerDay = maxAppointmentsPerDay;
    }

    // Getters return the values stored in the private fields.
    public String getTutorId() {
        return tutorId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSubjectArea() {
        return subjectArea;
    }

    public int getMaxAppointmentsPerDay() {
        return maxAppointmentsPerDay;
    }

    // Setters update the values stored in the private fields.
    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSubjectArea(String subjectArea) {
        this.subjectArea = subjectArea;
    }

    public void setMaxAppointmentsPerDay(int maxAppointmentsPerDay) {
        this.maxAppointmentsPerDay = maxAppointmentsPerDay;
    }

    // Returns the Tutor object's information as a readable String.
    @Override
    public String toString() {
        return "Tutor ID: " + tutorId
                + ", Full Name: " + fullName
                + ", Subject Area: " + subjectArea
                + ", Maximum Appointments Per Day: " + maxAppointmentsPerDay;
    }
}
