
public class Car 
{
	private int yearModel;
	private String make;
	private int speed;
	
	public Car(int yrModel, String manufacturer)
	{
		yearModel = yrModel;
		make = manufacturer;
		speed = 0;
	}
	public void accelerate()
	{
		speed+=5;
	}
	public void brake()
	{
		speed-=5;
	}
	public int getyearModel()
	{
		return yearModel;
	}
	public String getmake()
	{
		return make;
	}
	public int getspeed()
	{
		return speed;
	}
}