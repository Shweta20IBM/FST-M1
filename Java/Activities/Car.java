
public class Car {

	
		// TODO Auto-generated method stub
		// below are the characteristics
String color;
String transmission;
int make;
int tyres;
int speed;


	
	// below is the Constructor
Car(String color, String transmission, int make, int tyres, int speed) {
	this.color = color;
	this.transmission =transmission ;
	this.make = make;
	this.tyres =tyres;
	this.speed =speed;
	
}

	
	

	public void accelerate() {
		// TODO Auto-generated method stub
		speed++;
	}
public void brake () {
	this.speed = 0;
}
}
