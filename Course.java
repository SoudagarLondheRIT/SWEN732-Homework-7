// The Course and CourseSection classes are concrete course components that implement the CourseComponent interface. 
// They provide concrete implementations of the accept method, which assigns to the appropriate visitor method.

class Course implements CourseComponent 
{
    @Override
    public void accept(Visitor visitor) 
    {
        visitor.visit(this);
    }
}