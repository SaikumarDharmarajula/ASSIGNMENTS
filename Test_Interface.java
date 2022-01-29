package Assginment;
interface vehicle
{
	void cost();
	void milage();
}
abstract class car implements vehicle
{
	void wheels()
	{
		System.out.println("car has wheels");
	}
}
abstract class Bike implements vehicle
{
	void stand()
	{
		System.out.println("Bike has stand");
	}
}
class Audi extends car
{
	public void cost()
	{
		System.out.println("Audi cost is 30 lakhs");
	}
	public void milage()
	{
		System.out.println("Audi milage is 15km");
	}
}
class BMW extends car
{
	public void cost()
	{
		System.out.println("BMW cost is 40 lakhs");
	}
	public void milage()
	{
		System.out.println("BMW milage is 12km");
	}
}
class Ducati extends Bike
{
	public void cost()
	{
		System.out.println("Ducati cost is 5 lakhs");
	}
	public void milage()
	{
		System.out.println("Ducati milage is 30km");
	}
}
class KTM extends Bike
{
	public void cost()
	{
		System.out.println("KTM cost is 2 lakhs");
	}
	public void milage()
	{
		System.out.println("KTM milage is 40km");
	}
}
class CarFactory
{
	car getCar(String car)
	{
		if(car.equals("Audi"))
			return new Audi();
		else if(car.equals("BMW"))
			return new BMW();
		return null;
	}
}
class BikeFactory
{
	Bike getBike(String bike)
	{
		if(bike.equals("Ducati"))
			return new Ducati();
		else if(bike.equals("KTM"))
			return new KTM();
		return null;
	}
}
public class Test_Interface {

	public static void main(String[] args) {
		car a=new Audi();
		car b=new BMW();
		Bike b1=new Ducati();
		Bike b2=new KTM();
		System.out.println("Car details : ");
		System.out.println("\t Audi car details: ");
		a.wheels();
		a.cost();
		a.milage();
		System.out.println("\t BMW car details: ");
		b.wheels();
		b.cost();
		b.milage();
		System.out.println("Bike details: ");
		System.out.println("\t Ducati bike details: ");
		b1.stand();
		b1.cost();
		b1.milage();
		System.out.println("\t KTM bike details: ");
		b1.stand();
		b1.cost();
		b1.milage();
		

	}

}
