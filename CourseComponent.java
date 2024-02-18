// Course Component Interface
// Element Interface (CourseComponent): The CourseComponent interface defines the accept method, 
// which allows visitors to visit different types of course components.

interface CourseComponent 
{
    void accept(Visitor visitor);
}