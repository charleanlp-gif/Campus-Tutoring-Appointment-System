# CTAS Test Data

Keep this file open while testing the **Campus Tutoring Appointment
System (CTAS)** so that the same records are used throughout the
assessment.

## Students

  Student Number   Full Name             Programme                       Year of Study
  ---------------- --------------------- ----------------------------- ---------------
  ST001            Lerato Mokoena        Object Oriented Programming                 2
  ST002            Anika van der Merwe   Software Development                        1
  ST003            Ayesha Patel          Information Technology                      3
  ST004            Sipho Dlamini         Software Engineering                        2
  ST005            Liam Jacobs           Information Technology                      1

## Tutors

  Tutor ID   Full Name          Subject Area                    Maximum Appointments per Day
  ---------- ------------------ ----------------------------- ------------------------------
  T001       Brendon Magwagwa   Object Oriented Programming                                5
  T002       Megan Williams     Java Programming                                           3
  T003       Yusuf Khan         Software Development                                       4
  T004       Pieter Botha       Database Development                                       3
  T005       Zanele Nkosi       Networking                                                 2

## Appointments

  -------------------------------------------------------------------------------------
  Appointment   Student    Tutor ID   Subject       Date         Time Slot  Status
  ID            Number                                                      
  ------------- ---------- ---------- ------------- ------------ ---------- -----------
  A001          ST001      T001       Object        2026-09-28   10:00      Booked
                                      Oriented                              
                                      Programming                           

  A002          ST002      T002       Java          2026-09-28   11:00      Completed
                                      Programming                           

  A003          ST001      T001       Object        2026-09-29   13:00      Booked
                                      Oriented                              
                                      Programming                           

  A004          ST003      T003       Software      2026-09-29   14:00      Cancelled
                                      Development                           

  A005          ST004      T004       Database      2026-09-30   09:00      Missed
                                      Development                           
  -------------------------------------------------------------------------------------

## Valid Appointment Statuses

-   Booked
-   Completed
-   Cancelled
-   Missed

## Deliberate Invalid / Rejection Test Data

Use these only when a question requires evidence that validation or a
business rule works.

  -----------------------------------------------------------------------
  Test                    Data to Enter           Expected Result
  ----------------------- ----------------------- -----------------------
  Duplicate student       Register `ST001` again  Registration rejected
  number                                          

  Duplicate tutor ID      Register `T001` again   Registration rejected

  Blank student name      Leave the full name     Registration rejected
                          blank                   

  Invalid student number  `ST999`                 Booking rejected
  for booking                                     

  Invalid tutor ID for    `T999`                  Booking rejected
  booking                                         

  Duplicate appointment   `A001`                  Booking rejected
  ID                                              

  Invalid status          `Pending`               Status rejected

  Student booking limit   Try to give `ST001` a   Booking rejected
                          third active Booked     
                          appointment             
  -----------------------------------------------------------------------

## Q2(c) Recommended Test Run

Use the following records in this order:

1.  **ST001** --- Lerato Mokoena --- Object Oriented Programming ---
    Year 2
2.  **ST002** --- Anika van der Merwe --- Software Development --- Year
    1
3.  **T001** --- Brendon Magwagwa --- Object Oriented Programming ---
    Maximum 5 appointments per day
4.  **T002** --- Megan Williams --- Java Programming --- Maximum 3
    appointments per day
5.  Attempt to register **ST001** again to demonstrate the rejected
    duplicate registration.

Expected rejection message:

`Registration rejected: Student number already exists.`

> **Important:** Some rejection tests only become available once the
> relevant validation has been implemented in the assessment. Do not add
> later-question functionality early just to use all of this test data.
