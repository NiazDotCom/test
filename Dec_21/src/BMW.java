//derived class
class BMW extends Cars{

	//BMW is a subclass
	public int seatNum;
	
	//BMW subclass has constructor
	public BMW (int gear, int speed, int startspeed)
	{
		//invoking base-class (Cars) constructor
		super(gear, speed);
		
		seatNum = startspeed;
	}
	//Encapsulation get and set
		public void setNum(int newValue)
		{
			seatNum = newValue;
		}
		
		//toString is a function hat allows to return object
		//exist within a method
		public String toString()
		{
			return(super.toString()+
					"\nNumber of Seats is "+seatNum);		
		}

}
