package activities;

public class Car {
	
	String color ;
	String transmission;
	int make ;
	int tyres;
	int doors;
	
	Car()
	{
		this.doors = 4;
		this.tyres = 4;
	}

	public void displayCharacteristics(){
		System.out.println("Color of the car :" + color);
		System.out.println("transmission of the car :" + transmission);
		System.out.println("make of the car :" + make);
		System.out.println("No of tyres :" + tyres);
		System.out.println("No of doors:" + doors);
		
		
	}
	
	public void accelarate(){
		System.out.println("Car is moving forward.");
	}
	
	public void brake(){
		System.out.println("Car has stopped.");
	}
}
