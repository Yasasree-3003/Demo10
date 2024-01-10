import java.util.Scanner;
class Replace
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
String inputstr=s1.nextLine();
char ch=s1.next().charAt(0);
String c=String.valueOf(ch);
String res=inputstr.replaceAll(c,"@");
System.out.println(res);
}
}