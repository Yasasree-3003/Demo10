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
System.out.println("fruits:"+fruits);

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
System.out.println("Vegetables:"+Vegetables);

Vector<String>AnimalProduce=new Vector<>();
AnimalProduce.add("Chicken");
AnimalProduce.add("Meat");
AnimalProduce.add("Fish");
AnimalProduce.add("Eggs");
System.out.println("AnimalProduce:"+AnimalProduce);

Vector<String>DiaryProducts=new Vector<>();
DiaryProducts.add("Milk");
DiaryProducts.add("Eggs");
DiaryProducts.add("Cheese");
DiaryProducts.add("Butter");
DiaryProducts.add("Yogurt");
DiaryProducts.add("Ghee");
System.out.println("DiaryProducts:"+DiaryProducts);

Vector<String>BakeryProducts=new Vector<>();
BakeryProducts.add("Whole_wheat");
BakeryProducts.add("Kulchas");
BakeryProducts.add("Bakery_buns");
BakeryProducts.add("Biscuits");
BakeryProducts.add("Cakes");
System.out.println("BakeryProducts:"+BakeryProducts);

Vector<String>Condiments=new Vector<>();
Condiments.add("Salt");
Condiments.add("Pepper");
Condiments.add("Sugar");
System.out.println("Condiments:"+Condiments);

Vector<String>IndianSpecies=new Vector<>();
IndianSpecies.add("Cardamom");
IndianSpecies.add("cinnamom");
IndianSpecies.add("Nutmeg");
IndianSpecies.add("Zeera");
System.out.println("IndianSpecies:"+IndianSpecies);

Vector<String>Oil_and_Sauces=new Vector<>();
Oil_and_Sauces.add("Olive_oil,Mustrad_oil,Sunflower_oil");
Oil_and_Sauces.add("Soy_sauce");
Oil_and_Sauces.add("Fish_sauce");
System.out.println("Oil_and_Sauces:"+Oil_and_Sauces);


Vector<String>GrainsLegumes=new Vector<>();
GrainsLegumes.add("Atta");
GrainsLegumes.add("Rice");
GrainsLegumes.add("Pasta");
System.out.println("GrainsLegumes:"+GrainsLegumes);

Vector<String>Legumes=new Vector<>();
Legumes.add("chickpeas");
Legumes.add("kidney beans");
Legumes.add("lentil");
Legumes.add("beans");
System.out.println("Legumes:"+Legumes);

Vector<String>Snacks=new Vector<>();
Snacks.add("Walnuts");
Snacks.add("Almonds");
Snacks.add("Raisinus");
Snacks.add("Papad");
Snacks.add("Honey");
System.out.println("Snacks:"+Snacks);

Vector<String>CleaningSupplies=new Vector<>();
CleaningSupplies.add("Dishwasher_soap");
CleaningSupplies.add("Detergent_powder");
CleaningSupplies.add("Shaving_cream");
CleaningSupplies.add("Toilet_Cleaner");
CleaningSupplies.add("Floor_cleaner");
CleaningSupplies.add("soap");
CleaningSupplies.add("Tiolet_roll");
CleaningSupplies.add("Tissue_paper");
CleaningSupplies.add("Toothpaste");
CleaningSupplies.add("Brush");
CleaningSupplies.add("Broom");
CleaningSupplies.add("Mopper");
System.out.println("CleaningSupplies:"+CleaningSupplies);


Vector<String>groceries=new Vector<>();
groceries.addAll(fruits);
groceries.addAll(Vegetables);
groceries.addAll(AnimalProduce);
groceries.addAll(BakeryProducts);
groceries.addAll(DiaryProducts);
groceries.addAll(Condiments);
groceries.addAll(IndianSpecies);
groceries.addAll(Oil_and_Sauces);
groceries.addAll(GrainsLegumes);
groceries.addAll(Legumes);
groceries.addAll(Snacks);
groceries.addAll(CleaningSupplies);
System.out.println(" All groceries are:"+groceries);
}
}

