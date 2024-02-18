// The Main class serves as the client code that sets up the course catalog, 
// creates a visitor (ReportGenerator), and generates reports using the generateReports method.

public class Main 
{
    public static void main(String[] args) 
    {
        // Set up the course catalog
        CourseCatalog catalog = new CourseCatalog();
        catalog.addComponent(new Course());
        catalog.addComponent(new CourseSection());

        // Generate reports using the ReportGenerator visitor
        ReportGenerator reportGenerator = new ReportGenerator();
        catalog.generateReports(reportGenerator);
    }
}