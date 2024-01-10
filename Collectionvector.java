import java.util.Vector;
class Main1
{
public static void main(String args[])
{
Vector<String>mammals=new Vector<>();
mammals.add("Dog");
mammals.add("Horse");
mammals.add(2,"Cat");
System.out.println("Vector:"+mammals);
Vector<String>animals=new Vector<>();
animals.add("Crocodile");
animals.addAll(mammals);
System.out.println("New Vector:"+animals+"\n");

Vector<String>fruits=new Vector<>();
fruits.add("Apple");
fruits.add("Grapes");
fruits.add("Orange");
fruits.add(2,"Banana");
System.out.println("Vector:"+fruits);
Vector<String>fruits1=new Vector<>();
fruits1.add("Guava");
fruits1.addAll(fruits);
System.out.println("New Vector:"+fruits1);
}
}
