import java.util.*;
public class Collectionvectorstack
{
public static void main(String args[])
{
Stack<String>stack=new Stack<String>();
stack.push("Ayush");
stack.push("Garvit");
stack.push("Amit");
stack.push("Ashith");
stack.push("Garima");
stack.pop();
Iterator<String>itr=stack.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}