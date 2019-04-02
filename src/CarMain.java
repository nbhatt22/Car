
public class CarMain 
{

	public static void main(String[] args) 
	{
		Car car1 = new Car(2020, "Ferarri");
		
		for(int i = 0; i<5; i++)
		{
			car1.accelerate();
			System.out.println(car1.getspeed());
		}
		for(int j = 0; j<5; j++)
		{
			car1.brake();
			System.out.println(car1.getspeed());
		}
		

	}

}
