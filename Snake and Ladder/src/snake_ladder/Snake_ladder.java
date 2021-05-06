package snake_ladder;

public class Snake_ladder {

	public static void main(String[] args) {
		
		int initial=0;
		while (initial <= 150) {
			
			double roll1 = Math.floor((Math.random()*10) % 6)+1;
			int roll = (int)roll1;
	
			double option1 = Math.floor(Math.random()*10) % 3;
			int option = (int)option1;
			
				if (option == 1) {	
					
					initial= initial+roll;
					
					if (initial == 100) {
						
						System.out.println("Player 1 Won the game,position= "+initial);
						break;
							
					} else if (initial > 100){
						initial=initial-roll;
							
						}
				
					} else if (option == 2 ) {
						initial= initial-roll;
						if (initial < 0) {
							initial = 0;
						}
				
					} else {
						
					}
			}
		}
}
