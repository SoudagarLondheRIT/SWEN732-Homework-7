import java.util.*;

// Course Catalog Class
// The CourseCatalog class represents the object structure that holds a list of course components. 
// It provides a method (generateReports) for generating reports using a visitor.

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
