import java.util.*;

interface Visitor 
{
    void visit(Course course);
    void visit(CourseSection section);
    void visitEnrollmentStatistics(List<CourseComponent> components);
    void visitCourseRatings(List<CourseComponent> components);
}