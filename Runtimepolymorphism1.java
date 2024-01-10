class Person
{
public void move()
{
System.out.println("Person");
}
}
class Faculty extends Person
{
public void move()
{
System.out.println("Faculty");
}
}
class Student extends Faculty
{
public void move()
{
System.out.println("Student");
}
}
class Runtimepolymorphism1
{
public static void main(String args[])
{
Person p=new Person();
Person p1=new Faculty();
Person p2=new Student();
p.move();
p1.move();
p2.move();
}
}

