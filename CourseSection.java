class CourseSection implements CourseComponent 
{
    @Override
    public void accept(Visitor visitor) 
    {
        visitor.visit(this);
    }
}