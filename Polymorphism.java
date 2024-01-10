import java.util.Scanner;
class Polymorphism
{
    void print()
    {
        System.out.println("Welcome");
    }
    void print(String n)
    {
        System.out.println("Welcome"+n);
    }
}
class Test8
{
    public static void main(String args[])
    {
        Polymorphism p=new Polymorphism();
        p.print();
        Scanner s1=new Scanner(System.in);
        System.out.println("Please type your name:");
        String s=s1.next();
        p.print(s);
    }
}