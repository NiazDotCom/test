//base class = parent class = super class
//child class = sub class
class Cars {

	//cars class has 2 fields/characteristic
	public int gear;
	public int speed;
	
	//constructor
	public Cars(int gear, int speed)
	{
		this.gear = gear;
		this.speed = speed;	
	}
	
	//3 methods
	public void pushBreak(int decrement)
	{
		speed-=decrement;
	}
	
	public void increaseSpeed(int increment)
	{
		speed+=increment;
	}
	
	//toString is a function hat allows to return object
	//exist within a method
	public String toString()
	{
		return ("No of gears are "+gear
				+"\n"	//"\n" line break
				+"speed of the Car is "+speed);
	}

}
