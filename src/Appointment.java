public class Appointment {

    // Private fields store the information that belongs to each Appointment object.
    // Using private fields supports encapsulation by preventing direct access
    // to the data from outside the Appointment class.
    private String appointmentId;
    private String studentNumber;
    private String tutorId;
    private String subject;
    private String date;
    private String timeSlot;
    private String status;

    // Constructor creates an Appointment object and gives its fields their starting values.
    public Appointment(String appointmentId, String studentNumber, String tutorId,
                       String subject, String date, String timeSlot, String status) {
        this.appointmentId = appointmentId;
        this.studentNumber = studentNumber;
        this.tutorId = tutorId;
        this.subject = subject;
        this.date = date;
        this.timeSlot = timeSlot;
        this.status = status;
    }

    // Getters return the values stored in the private fields.
    public String getAppointmentId() {
        return appointmentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getTutorId() {
        return tutorId;
    }

    public String getSubject() {
        return subject;
    }

    public String getDate() {
        return date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public String getStatus() {
        return status;
    }

    // Setters update the values stored in the private fields.
    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Returns the Appointment object's information as a readable String.
    @Override
    public String toString() {
        return "Appointment ID: " + appointmentId
                + ", Student Number: " + studentNumber
                + ", Tutor ID: " + tutorId
                + ", Subject: " + subject
                + ", Date: " + date
                + ", Time Slot: " + timeSlot
                + ", Status: " + status;
    }
}
