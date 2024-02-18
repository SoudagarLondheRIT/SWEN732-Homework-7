import java.util.*;

// Visitor Interface (Visitor): The Visitor interface defines methods for visiting different types of course components (Course and CourseSection) 
// as well as methods for generating reports (visitEnrollmentStatistics and visitCourseRatings).
interface Visitor 
{
    void visit(Course course);
    void visit(CourseSection section);
    void visitEnrollmentStatistics(List<CourseComponent> components);
    void visitCourseRatings(List<CourseComponent> components);
}