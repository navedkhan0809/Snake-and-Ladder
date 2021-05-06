package snake_ladder;

public class Snake_ladder {

	public static void main(String[] args) {
		
		int initial=0;
		System.out.println("For player 1,start position= "+initial);
		
		double roll1 = Math.floor((Math.random()*10) % 6)+1;
		int roll = (int)roll1;
		System.out.println("number on rolling a die= "+roll);

		double option1 = Math.floor(Math.random()*10) % 3;
		int option = (int)option1;
		
		switch (option) {
		
			case 1: {
			System.out.println("Its a ladder");	
			initial= initial+roll;
			break;
			}
			
			case 2: {
			System.out.println("Its a snake");
			initial= initial-roll;
				if (initial < 0) {
					initial = 0;
				}
			break;
			}
			
			default:
			System.out.println("No Play");
			initial = initial;
		}
		System.out.println("Now position becomes = "+initial);
	}

}
