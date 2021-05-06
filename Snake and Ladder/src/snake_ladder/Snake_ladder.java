package snake_ladder;

public class Snake_ladder {

	public static void main(String[] args) {
		
		int initial=0,n=0;
		System.out.println("For player 1,start position= "+initial);
		
		while (initial <= 150) {
			
			double roll1 = Math.floor((Math.random()*10) % 6)+1;
			int roll = (int)roll1;
			
			System.out.println("Die roll= "+roll);
			n++;
	
			double option1 = Math.floor(Math.random()*10) % 3;
			int option = (int)option1;
			
				if (option == 1) {
					
						System.out.println("Its a ladder");	
						initial= initial+roll;
						
						System.out.println("Position ="+initial);
							if (initial == 100) {
								
								System.out.println("Player 1 Won the game,position= "+initial);
								System.out.println("The number of times the dies was played to win="+n);
								break;
								
							} else if (initial > 100){
								initial=initial-roll;
							}
				
				} else if (option == 2 ) {
					
					System.out.println("Its a snake");
					initial= initial-roll;
					System.out.println("Position ="+initial);
					
						if (initial < 0) {
							initial = 0;
						}
				
				} else {
					System.out.println("No Play");
					System.out.println("Position ="+initial);
				}

			}
		}
}
