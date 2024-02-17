import java.util.*;

// Course Catalog Classes
public class CourseCatalog 
{
    private List<CourseComponent> components = new ArrayList<>();

    public void addComponent(CourseComponent component) 
    {
        components.add(component);
    }

    public void generateReports(Visitor visitor) 
    {
        for (CourseComponent component : components) {
            component.accept(visitor);
        }
        visitor.visitEnrollmentStatistics(components);
        visitor.visitCourseRatings(components);
    }
}
