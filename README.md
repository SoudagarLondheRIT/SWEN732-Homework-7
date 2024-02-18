# SWEN732-Homework-7

## Introduction
Project: Course Enrollment System

Description:
Following project is developing a course enrollment system for a college or university. The system allows students to enroll in courses, drop courses, and view their current schedule. Additionally, the system needs to generate various reports, such as enrollment statistics, course popularity, etc. The Visitor pattern can be used to generate these reports while keeping the course and student classes closed for modification but open for extension.

## Functionality of Code
Visitor Interface (Visitor): The Visitor interface defines methods for visiting different types of course components (Course and CourseSection) as well as methods for generating reports (visitEnrollmentStatistics and visitCoursePopularity).

Concrete Visitor (ReportGenerator): The ReportGenerator class is a concrete visitor that implements the Visitor interface. It provides concrete implementations for visiting course components and generating reports.

Element Interface (CourseComponent): The CourseComponent interface defines the accept method, which allows visitors to visit different types of course components.

Concrete Elements (Course and CourseSection): The Course and CourseSection classes are concrete course components that implement the CourseComponent interface. They provide concrete implementations of the accept method, which delegates to the appropriate visitor method.

Object Structure (CourseCatalog): The CourseCatalog class represents the object structure that holds a list of course components. It provides a method (generateReports) for generating reports using a visitor.

Client Code (Main): The Main class serves as the client code that sets up the course catalog, creates a visitor (ReportGenerator), and generates reports using the generateReports method.

In this project, the Visitor pattern is used to generate reports in the course enrollment system. The CourseComponent interface defines an accept method, allowing each course component class to accept a visitor. The Visitor interface defines visit methods for different types of course components, and the ReportGenerator class implements these methods to generate reports. Finally, in the client code, we set up the course catalog with various components and use the ReportGenerator visitor to generate reports. This approach allows for easy addition of new report types or course component classes without modifying the existing codebase.

Overall, this example effectively demonstrates the Visitor pattern by separating the algorithm for generating reports from the course components themselves. This allows for easy addition of new types of reports without modifying the course components.