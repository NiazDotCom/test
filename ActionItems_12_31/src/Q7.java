
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] Ad = new  String[18];
		
		Ad[0] = "Hello";
		Ad[1] = "Someone like you";
		Ad[2] = "Set fire to the Rain";
		Ad[3] = "He Won't Go";
		Ad[4] = "Now and Then";
		Ad[5] = "Can't Let Go";
		Ad[6] = "Why Do You Love Me";
		Ad[7] = "First Love";
		Ad[8] = "I Found a Boy";
		Ad[9] = "Hiding a Heart";
		Ad[10] = "If It Hadn't Been For Love";
		Ad[11] = "Million Years Ago";
		Ad[12] = "That's It, I Quit, I'm Movin' On";
		Ad[13] = "Lay Me Down";
		Ad[14] = "Lovesong";
		Ad[15] = "Tired";
		Ad[16] = "Painting Pictures";
		Ad[17] = "Many Shades of Black";

		String [] FoB = new  String[18];
		
		FoB[0] = "THIS AIN’T A SCENE, IT’S AN ARMS RACE";
		FoB[1] = "I DON’T CARE";
		FoB[2] = "SUGAR, WE’RE GOIN’ DOWN";
		FoB[3] = "MY SONGS KNOW WHAT YOU DID IN THE DARK";
		FoB[4] = "SHE’S MY WINONA";
		FoB[5] = "THNKS FR TH MMRS";
		FoB[6] = "IMMORTALS";
		FoB[7] = "UMA THURMAN";
		FoB[8] = "AMERICAN BEAUTY/AMERICAN PSYCHO";
		FoB[9] = "SATURDAY";
		FoB[10] = "CENTURIES";
		FoB[11] = "DANCE, DANCE";
		FoB[12] = "THE PHOENIX";
		FoB[13] = "IRRESISTABLE";
		FoB[14] = "THE LAST OF THE REAL ONES";
		FoB[15] = "DEAR FUTURE SELF";
		FoB[16] = "BOB DYLAN";
		FoB[17] = "CHURCH";
		
		String [] Drk = new  String[18];
		
		Drk[0] = "God's Plan";
		Drk[1] = "Money In The Grave";
		Drk[2] = "In My Feelings";
		Drk[3] = "Nonstop";
		Drk[4] = "Girls Need Love";
		Drk[5] = "Passionfruit";
		Drk[6] = "Nice for What";
		Drk[7] = "Hotline Bling";
		Drk[8] = "Hold On, We're Going Home";
		Drk[9] = "Started From the Bottom";
		Drk[10] = "Marvins Room";
		Drk[11] = "Take Care";
		Drk[12] = "One Dance";
		Drk[13] = "Yes Indeed";
		Drk[14] = "Fake Love";
		Drk[15] = "Forever";
		Drk[16] = "Energy";
		Drk[17] = "Mob Ties";
		
		
		
		String artist = "Adele";
		switch(artist)
		{
		case "Adele": 
			for (Object obj : Ad)
			{
				System.out.println(obj);
			}
		break;
		
		case "Fall Out Boys":
			for (Object obj : FoB)
			{
				System.out.println(obj);
			}
		break;
		
		case "Drake": 
			for (Object obj : Drk)
			{
				System.out.println(obj);
			}
		break;
		
		default: System.out.println("Artist not found");
		break;
		}
	}

}
