import java.util.*;

// Concrete Visitor Class for Generating Reports
class ReportGenerator implements Visitor 
{
    @Override
    public void visit(Course course) 
    {
        System.out.println("Generating report for course: " + course);
    }

    @Override
    public void visit(CourseSection section) 
    {
        System.out.println("Generating report for course section: " + section);
    }
    
    @Override
    public void visitEnrollmentStatistics(List<CourseComponent> components) 
    {
        // Generate enrollment statistics report
        System.out.println("Generating enrollment statistics report...");
    }
    
    @Override
    public void visitCourseRatings(List<CourseComponent> components) 
    {
        // Generate course Ratings report
        System.out.println("Generating course Ratings report...");
    }
}