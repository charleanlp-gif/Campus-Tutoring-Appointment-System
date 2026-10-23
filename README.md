# Campus Tutoring Appointment System (CTAS)

**Java console application | Object-Oriented Programming portfolio project**

CTAS is a menu-driven campus tutoring appointment management system developed as part of an Object-Oriented Programming formative assessment. It demonstrates foundational Java programming, class design, input validation, collection management, and appointment reporting.

**Assessment result:** 98/100 (98%) in OBOP102 Formative Assessment 1, 2026. Official assessment evidence: [View my marked assessment result (98%)](docs/CTAS_Assessment_Result_98_Percent.pdf).

## Features

- Register students and tutors using interactive console input.
- Book appointments with basic validation and business rules.
- Display and search appointments.
- Generate appointment reports, including booking counts, completed percentages, and status-based results.
- Use dedicated `Student`, `Tutor`, and `Appointment` model classes.

## Technology

- Java (developed with JDK 21)
- IntelliJ IDEA
- Java `ArrayList`, `Scanner`, methods, loops, conditionals, and classes

## Run locally

In the project folder, with a JDK installed:

```bash
javac -d build src/*.java
java -cp build CTASApp
```

Or open the `src` files in an IntelliJ IDEA Java project and run `CTASApp.main()`.

## Project structure

```text
src/
  CTASApp.java        # Console menu, business logic and reports
  Student.java        # Student model
  Tutor.java          # Tutor model
  Appointment.java    # Appointment model
TEST_DATA.md          # Suggested manual test records
README.md             # Project documentation
.gitignore            # Excludes build and IDE artifacts
```

## Notes and limitations

- This is an academic Java console application, not a production booking service.
- Data is held in memory and is not persisted after the application closes.
- Demo records and test names are fictional examples.
- The code is presented as submitted, without introducing unassessed functionality.

## Assessment evidence

The project received **98%** for OBOP102 Formative Assessment 1 (2026). The marked assessment document is intentionally not included in this public-ready package because it contains student identifiers and assessment materials. A privacy-reviewed excerpt or assessor-authorized evidence can be added later.

## Author

Charlean du Plessis
