
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mon = 2;
		String monthString;
		switch(mon)
		{
		case 1: monthString = "Jan";
		break;
		
		case 2: monthString = "Feb";
		break;
		
		case 3: monthString = "Mar";
		break;
		
		case 4: monthString = "Apr";
		break;
		
		case 5: monthString = "May";
		break;
		
		case 6: monthString = "Jun";
		break;
		
		case 7: monthString = "Jul";
		break;

		case 8: monthString = "Aug";
		break;
		
		case 9: monthString = "Sept";
		break;
		
		case 10: monthString = "Oct";
		break;
		
		case 11: monthString = "Nov";
		break;

		case 12: monthString = "Dec";
		break;
		
		default: monthString = "invalid";
		break;
		}
		System.out.println(monthString);
		
	}

}
