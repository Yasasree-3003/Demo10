class Animal
{
public void move()
{
System.out.println("Call from Animal class");
}
}
class Wild extends Animal
{
public void move()
{
System.out.println("Call from Wild class");
}
}
class Pet extends Animal
{
public void move()
{
System.out.println("Call from Pet class");
}
}
class Runtimepolymorphism2
{
public static void main(String args[])
{
Animal p=new Animal();
Animal p1=new Wild();
Animal p2=new Pet();
p.move();
p1.move();
p2.move();
}
}
