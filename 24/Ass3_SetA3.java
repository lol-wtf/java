import java.io.*;
class Vehicle
{
int price;
String company;
   Vehicle(String c,int p)
   {
       company=c;
       price=p;
   }
	
   public void display()
   {
	System.out.print("Company : "+company+"\tPrice : "+price);
   }
}
class LightMotorVehicle extends Vehicle
{
   int mileage;
   
   LightMotorVehicle(String c,int p,int m) 
   {
	super(c,p);
        mileage=m;
   }
    public void display()
   {
	super.display();
	System.out.println("\tMileage : "+mileage);
   }
}
class HeavyMotorVehicle extends Vehicle
{

   int cap_in_tons;
   HeavyMotorVehicle(String c,int p,int cap) 
   {
	super(c,p);
        cap_in_tons=cap;
   }
    public void display()
   {
	super.display();
	System.out.println("\tCapacity_in_tons : "+cap_in_tons);
   }
}  
class Ass3_SetA3

