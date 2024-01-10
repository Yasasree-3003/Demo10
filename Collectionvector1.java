import java.util.Vector;
class Main2
{
public static void main(String args[])
{
Vector<String>fruits=new Vector<>();
fruits.add("Apple");
fruits.add("Grapes");
fruits.add("Orange");
fruits.add("Mango");
fruits.add("Papaya");
fruits.add("PineApple");
fruits.add("Watermelon");
fruits.add("Banana");
fruits.add("Guava");
fruits.add("Citrus");
fruits.add("Peaches");
fruits.add("Pears");
System.out.println("Vector:"+fruits);
Vector<String>grocerries=new Vector<>();
grocerries.addAll(fruits);
System.out.println("Grocerry:"+grocerries);

Vector<String>Vehicles=new Vector<>();
Vehicles.add("Car");
Vehicles.add("Bus");
Vehicles.add("Cycle");
Vehicles.add(2,"Auto");
System.out.println("Vector:"+Vehicles);
Vector<String>Vehicles1=new Vector<>();
Vehicles1.add("Bike");
Vehicles1.addAll(Vehicles);
System.out.println(" New Vector:"+Vehicles1);
/*
Vector<String>Vegetables=new Vector<>();
Vegetables.add("Onions");
Vegetables.add("Tomoto");
Vegetables.add("Chilies");
Vegetables.add("Ginger");
Vegetables.add("Garlic");
Vegetables.add("Potato");
Vegetables.add("Brinjal");
Vegetables.add("Carrot");
Vegetables.add("Broccoli");
Vegetables.add(2,"Ladies finger");
System.out.println("Vector:"+Vegetables);
Vector<String>Vegetables1=new Vector<>();
Vegetables1.add("Cabbage");
Vegetables1.addAll(Vegetables1);
System.out.println("New Vector:"+Vegetables1);*/

}
}

