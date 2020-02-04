package NewYearGift;
import java.util.*;
class Candies {
public long priceOfCandy = 0;
public long quantity=0;
public String nameOfCandy = "";
public String typeOfCandy = "";
static public long netWeightCandies;

public Candies()
{
System.out.println("Before Sorting Candies based on Price");
System.out.println("CandyName"+"     "+"CandyType"+" "+"CandyPrice"+" "+"CandyQuantity");
}
public Candies(String nameOfCandy,String typeOfCandy,long priceOfCandy, long quantity ) {
super();
this.nameOfCandy=nameOfCandy;

this.typeOfCandy=typeOfCandy;
               
this.priceOfCandy = priceOfCandy;


this.quantity=quantity;
System.out.println(nameOfCandy+"     "+typeOfCandy+"            "+priceOfCandy+"     "+quantity);
netWeightCandies+=quantity;
}


public long getPrice()
{
      return priceOfCandy;

}


@Override
public String toString()
{
return "Candyname="+ this.nameOfCandy+" "+"Price=" +this.priceOfCandy;
}

public static long weightOfCand() {
return netWeightCandies;

}




}




public class App {

public App() {
// Depends on your usage, it may be useful or not
}

public static void main(String[] args) {

ArrayList<Candies> arrayList=new ArrayList<Candies>();
Candies candyobj1=new Candies();
//Create lot of Instances for Chocolates here to access all

arrayList.add(new  Candies("Dairymilk","Milk",80,50));
arrayList.add(new  Candies("Bournvile","Dark",75,40));
arrayList.add(new  Candies("LotusChoc","Crem",30,50));
arrayList.add(new  Candies("Snickerss","Nuts",40,50));

Comparator<Candies> CandyCom=new Comparator<Candies>()
{
public int compare(Candies can1,Candies can2) {
if(can1.getPrice()>can2.getPrice())

return 1;
else
return -1;
}

};
                 System.out.println("After sorting");
Collections.sort(arrayList,CandyCom);
for(Candies candyItem:arrayList)
{

System.out.println(candyItem);
}


    System.out.println("Total weight of Gift is"+ candyobj1.weightOfCand());




//Create lot of Instances for Candies here to access all

}
}



