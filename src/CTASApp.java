import java.util.ArrayList;
import java.util.Scanner;

public class CTASApp {

    // ArrayLists store Student, Tutor and Appointment objects.
    // Unlike fixed arrays, ArrayLists can grow as new objects are added.
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Tutor> tutors = new ArrayList<>();
    static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {

        // Scanner allows the program to receive keyboard input from the user.
        Scanner scanner = new Scanner(System.in);

        // Stores the option selected by the user from the CTAS menu.
        int menuChoice = 0;

        // Sample objects demonstrate the Student, Tutor and Appointment classes.
        Student sampleStudent = new Student(
                "ST001",
                "Lerato Mokoena",
                "Object Oriented Programming",
                2
        );

        Tutor sampleTutor = new Tutor(
                "T001",
                "Brendon Magwagwa",
                "Object Oriented Programming",
                5
        );

        Appointment sampleAppointment = new Appointment(
                "A001",
                "ST001",
                "T001",
                "Object Oriented Programming",
                "2026-09-28",
                "10:00",
                "Booked"
        );

        // Displays the sample objects using their toString() methods.
        System.out.println("\n===== SAMPLE CTAS OBJECTS =====");
        System.out.println(sampleStudent);
        System.out.println(sampleTutor);
        System.out.println(sampleAppointment);

        // The do-while loop repeats the menu until the user selects option 6.
        do {
            System.out.println("\n===== CAMPUS TUTORING APPOINTMENT SYSTEM =====");
            System.out.println("1. Student Registration");
            System.out.println("2. Tutor Registration");
            System.out.println("3. Appointment Booking");
            System.out.println("4. Appointment Display");
            System.out.println("5. Reports");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            // Checks that the menu input is a number before reading it.
            if (scanner.hasNextInt()) {
                menuChoice = scanner.nextInt();
            } else {
                System.out.println("Invalid menu option. Please enter a number from 1 to 6.");
                scanner.nextLine(); // Removes the invalid input.
                continue; // Returns to the beginning of the menu loop.
            }

            // The switch statement determines which menu option will be processed.
            switch (menuChoice) {
                case 1:
                    scanner.nextLine(); // Clears the newline left by nextInt().

                    System.out.print("Enter student number: ");
                    String studentNumber = scanner.nextLine();

                    System.out.print("Enter student full name: ");
                    String studentName = scanner.nextLine();

                    // A blank name is not accepted.
                    if (studentName.trim().isEmpty()) {
                        System.out.println("Registration rejected: Student name cannot be blank.");
                        break;
                    }

                    // Searches the students ArrayList for a duplicate student number.
                    boolean duplicateStudent = false;

                    for (Student student : students) {
                        if (student.getStudentNumber().equalsIgnoreCase(studentNumber)) {
                            duplicateStudent = true;
                            break;
                        }
                    }

                    // Rejects the registration if the student number already exists.
                    if (duplicateStudent) {
                        System.out.println("Registration rejected: Student number already exists.");
                        break;
                    }

                    System.out.print("Enter programme name: ");
                    String programme = scanner.nextLine();

                    System.out.print("Enter year of study: ");
                    int yearOfStudy = scanner.nextInt();

                    // Creates a Student object using the entered registration details.
                    Student newStudent = new Student(
                            studentNumber,
                            studentName,
                            programme,
                            yearOfStudy
                    );

                    // Adds the Student object to the students ArrayList.
                    students.add(newStudent);

                    System.out.println("Student registered successfully.");
                    break;

                case 2:
                    scanner.nextLine(); // Clears the newline left by nextInt().

                    System.out.print("Enter tutor ID: ");
                    String tutorId = scanner.nextLine();

                    // Searches the tutors ArrayList for a duplicate tutor ID.
                    boolean duplicateTutor = false;

                    for (Tutor tutor : tutors) {
                        if (tutor.getTutorId().equalsIgnoreCase(tutorId)) {
                            duplicateTutor = true;
                            break;
                        }
                    }

                    // Rejects the registration if the tutor ID already exists.
                    if (duplicateTutor) {
                        System.out.println("Registration rejected: Tutor ID already exists.");
                        break;
                    }

                    System.out.print("Enter tutor full name: ");
                    String tutorName = scanner.nextLine();

                    // A blank name is not accepted.
                    if (tutorName.trim().isEmpty()) {
                        System.out.println("Registration rejected: Tutor name cannot be blank.");
                        break;
                    }

                    System.out.print("Enter subject area: ");
                    String subjectArea = scanner.nextLine();

                    System.out.print("Enter maximum appointments per day: ");
                    int maximumAppointments = scanner.nextInt();

                    // Creates a Tutor object using the entered registration details.
                    Tutor newTutor = new Tutor(
                            tutorId,
                            tutorName,
                            subjectArea,
                            maximumAppointments
                    );

                    // Adds the Tutor object to the tutors ArrayList.
                    tutors.add(newTutor);

                    System.out.println("Tutor registered successfully.");
                    break;

                case 3:
                        scanner.nextLine(); // Clears the newline left by nextInt().

                        System.out.print("Enter appointment ID: ");
                        String appointmentId = scanner.nextLine();

                        System.out.print("Enter student number: ");
                        String bookingStudentNumber = scanner.nextLine();

                        System.out.print("Enter tutor ID: ");
                        String bookingTutorId = scanner.nextLine();

                        System.out.print("Enter subject: ");
                        String appointmentSubject = scanner.nextLine();

                        System.out.print("Enter appointment date: ");
                        String appointmentDate = scanner.nextLine();

                        System.out.print("Enter time slot: ");
                        String appointmentTimeSlot = scanner.nextLine();

                        // Searches the students ArrayList to check whether the student exists.
                        boolean studentExists = false;

                        for (Student student : students) {
                            if (student.getStudentNumber().equalsIgnoreCase(bookingStudentNumber)) {
                                studentExists = true;
                                break;
                            }
                        }

                        // Rejects the booking if the student number is not registered.
                        if (!studentExists) {
                            System.out.println("Booking rejected: Invalid student number.");
                            break;
                        }

                        // Searches the tutors ArrayList to check whether the tutor exists.
                        boolean tutorExists = false;

                        for (Tutor tutor : tutors) {
                            if (tutor.getTutorId().equalsIgnoreCase(bookingTutorId)) {
                                tutorExists = true;
                                break;
                            }
                        }

                        // Rejects the booking if the tutor ID is not registered.
                        if (!tutorExists) {
                            System.out.println("Booking rejected: Invalid tutor ID.");
                            break;
                        }

                        // Searches the appointments ArrayList for a duplicate appointment ID.
                        boolean duplicateAppointment = false;

                        for (Appointment appointment : appointments) {
                            if (appointment.getAppointmentId().equalsIgnoreCase(appointmentId)) {
                                duplicateAppointment = true;
                                break;
                            }
                        }

                        // Rejects the booking if the appointment ID already exists.
                        if (duplicateAppointment) {
                            System.out.println("Booking rejected: Duplicate appointment ID.");
                            break;
                        }

                        // Counts the student's existing active Booked appointments
                        // by checking the Appointment objects in the ArrayList.
                        int studentBookedCount = 0;

                        for (Appointment appointment : appointments) {
                            if (appointment.getStudentNumber().equalsIgnoreCase(bookingStudentNumber)
                                    && appointment.getStatus().equalsIgnoreCase("Booked")) {
                                studentBookedCount++;
                            }
                        }

                        // A student may have a maximum of two active Booked appointments.
                        if (studentBookedCount >= 2) {
                            System.out.println("Booking rejected: Student already has two active Booked appointments.");
                            break;
                        }

                        // Finds the selected Tutor object in the tutors ArrayList.
                        Tutor selectedTutor = null;

                        for (Tutor tutor : tutors) {
                            if (tutor.getTutorId().equalsIgnoreCase(bookingTutorId)) {
                                selectedTutor = tutor;
                                break;
                            }
                        }

                        // Counts the tutor's appointments on the selected date
                        // by checking the Appointment objects in the ArrayList.
                        int tutorDailyAppointmentCount = 0;

                        for (Appointment appointment : appointments) {
                            if (appointment.getTutorId().equalsIgnoreCase(bookingTutorId)
                                    && appointment.getDate().equalsIgnoreCase(appointmentDate)) {
                                tutorDailyAppointmentCount++;
                            }
                        }

                        // Rejects the booking if the tutor has reached the daily maximum.
                        if (tutorDailyAppointmentCount >= selectedTutor.getMaxAppointmentsPerDay()) {
                            System.out.println("Booking rejected: Tutor has reached the maximum appointments for this day.");
                            break;
                        }

                        // Creates an Appointment object only after all business-rule checks have passed.
                        // All new appointments begin with the status Booked.
                        Appointment newAppointment = new Appointment(
                                appointmentId,
                                bookingStudentNumber,
                                bookingTutorId,
                                appointmentSubject,
                                appointmentDate,
                                appointmentTimeSlot,
                                "Booked"
                        );

                        // Stores the complete Appointment object in the appointments ArrayList.
                        appointments.add(newAppointment);

                        System.out.println("Appointment booked successfully.");
                    break;

                case 4:
                    scanner.nextLine(); // Clears the newline left by nextInt().

                    System.out.print("Enter appointment status to display: ");
                    String statusChoice = scanner.nextLine();

                    // Checks that the entered status is one of the four valid CTAS statuses.
                    if (!statusChoice.equalsIgnoreCase("Booked")
                            && !statusChoice.equalsIgnoreCase("Completed")
                            && !statusChoice.equalsIgnoreCase("Cancelled")
                            && !statusChoice.equalsIgnoreCase("Missed")) {

                        System.out.println("Invalid status. Use Booked, Completed, Cancelled, or Missed.");
                        break;
                    }

                    // Calls the reusable method to display appointments with the selected status.
                    displayAppointmentsByStatus(statusChoice);
                    break;

                case 5:
                    scanner.nextLine(); // Clears the newline left by nextInt().

                    System.out.println("\n===== REPORTS =====");
                    System.out.println("1. Display All Appointments");
                    System.out.println("2. Search Appointment by ID");
                    System.out.println("3. Appointment Statistics");
                    System.out.print("Enter report choice: ");

                    int reportChoice = scanner.nextInt();

                    switch (reportChoice) {

                        case 1:
                            displayAllAppointments();
                            break;

                        case 2:
                            scanner.nextLine(); // Clears the newline left by nextInt().

                            System.out.print("Enter appointment ID to search: ");
                            String searchId = scanner.nextLine();

                            // Calls the reusable method and passes the entered appointment ID to it.
                            searchAppointmentById(searchId);
                            break;

                        case 3:
                            // Calls the reusable methods to calculate appointment statistics.
                            int bookedCount = countBookedAppointments();
                            double completedPercentage = calculateCompletedPercentage();

                            System.out.println("\n===== APPOINTMENT STATISTICS =====");
                            System.out.println("Total appointments: " + appointments.size());
                            System.out.println("Booked appointments: " + bookedCount);
                            System.out.println("Completed percentage: " + completedPercentage + "%");
                            break;

                        default:
                            System.out.println("Invalid report option.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting CTAS.");
                    break;

                default:
                    System.out.println("Invalid menu option.");
            }

        } while (menuChoice != 6);

        scanner.close();
    }

    // Displays all Appointment objects currently stored in the appointments ArrayList.
    public static void displayAllAppointments() {

        // Checks whether the ArrayList contains any appointments.
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }

        System.out.println("\n===== ALL APPOINTMENTS =====");

        // Loops through each Appointment object in the ArrayList.
        for (Appointment appointment : appointments) {
            System.out.println("Appointment ID: " + appointment.getAppointmentId());
            System.out.println("Student Number: " + appointment.getStudentNumber());
            System.out.println("Tutor ID: " + appointment.getTutorId());
            System.out.println("Subject: " + appointment.getSubject());
            System.out.println("Date: " + appointment.getDate());
            System.out.println("Time Slot: " + appointment.getTimeSlot());
            System.out.println("Status: " + appointment.getStatus());
            System.out.println("----------------------------");
        }
    }

    // Searches for and displays an Appointment object using its appointment ID.
    public static void searchAppointmentById(String searchId) {

        boolean appointmentFound = false;

        // Searches each Appointment object stored in the ArrayList.
        for (Appointment appointment : appointments) {

            if (appointment.getAppointmentId().equalsIgnoreCase(searchId)) {
                System.out.println("\n===== APPOINTMENT FOUND =====");
                System.out.println("Appointment ID: " + appointment.getAppointmentId());
                System.out.println("Student Number: " + appointment.getStudentNumber());
                System.out.println("Tutor ID: " + appointment.getTutorId());
                System.out.println("Subject: " + appointment.getSubject());
                System.out.println("Date: " + appointment.getDate());
                System.out.println("Time Slot: " + appointment.getTimeSlot());
                System.out.println("Status: " + appointment.getStatus());

                appointmentFound = true;
                break;
            }
        }

        if (!appointmentFound) {
            System.out.println("Appointment not found.");
        }
    }

    // Counts and returns the number of Appointment objects with the status Booked.
    public static int countBookedAppointments() {

        int bookedCount = 0;

        // Checks the status of each Appointment object in the ArrayList.
        for (Appointment appointment : appointments) {
            if (appointment.getStatus().equalsIgnoreCase("Booked")) {
                bookedCount++;
            }
        }

        return bookedCount;
    }

    // Calculates and returns the percentage of Appointment objects that are Completed.
    public static double calculateCompletedPercentage() {

        // Prevents division by zero when there are no appointments.
        if (appointments.isEmpty()) {
            return 0.0;
        }

        int completedCount = 0;

        // Checks the status of each Appointment object in the ArrayList.
        for (Appointment appointment : appointments) {
            if (appointment.getStatus().equalsIgnoreCase("Completed")) {
                completedCount++;
            }
        }

        // Calculates the percentage using the number of objects in the ArrayList.
        return (completedCount * 100.0) / appointments.size();
    }

    // Displays Appointment objects that match a selected status
    // together with the details of the linked Tutor object.
    public static void displayAppointmentsByStatus(String selectedStatus) {

        boolean appointmentFound = false;

        // Searches the Appointment objects for the selected status.
        for (Appointment appointment : appointments) {

            if (appointment.getStatus().equalsIgnoreCase(selectedStatus)) {

                System.out.println("\nAppointment ID: " + appointment.getAppointmentId());
                System.out.println("Student Number: " + appointment.getStudentNumber());
                System.out.println("Subject: " + appointment.getSubject());
                System.out.println("Date: " + appointment.getDate());
                System.out.println("Time Slot: " + appointment.getTimeSlot());
                System.out.println("Status: " + appointment.getStatus());

                // Searches the tutors ArrayList for the Tutor object
                // linked to this appointment.
                for (Tutor tutor : tutors) {

                    if (tutor.getTutorId().equalsIgnoreCase(appointment.getTutorId())) {
                        System.out.println("Tutor ID: " + tutor.getTutorId());
                        System.out.println("Tutor Name: " + tutor.getFullName());
                        System.out.println("Tutor Subject Area: " + tutor.getSubjectArea());
                        break;
                    }
                }

                System.out.println("----------------------------");
                appointmentFound = true;
            }
        }

        if (!appointmentFound) {
            System.out.println("No appointments found with status: " + selectedStatus);
        }
    }
}