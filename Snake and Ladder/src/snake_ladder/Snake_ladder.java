package snake_ladder;

public class Snake_ladder {

	public static void main(String[] args) {
			
			int initial=0,initial2=0;
			System.out.println("For player 1,start position= "+initial);
			System.out.println("For player 2,start position= "+initial2);
			System.out.println("Lets start playing....");
		
			while (initial <= 150) {
				
				double roll11 = Math.floor((Math.random()*10) % 6)+1;
				int roll = (int)roll11;
				
				double roll12 = Math.floor((Math.random()*10) % 6)+1;
				int roll2 = (int)roll12;
				
		
				double option1 = Math.floor(Math.random()*10) % 3;
				int option = (int)option1;
				
				double option12 = Math.floor(Math.random()*10) % 3;
				int option2 = (int)option12;
				
					if (option == 1 && option2 == 1) {
						
							// Its a ladder condition
							initial= initial+roll;
							initial2= initial2+roll2;
							
								if (initial > 100) {
									initial=initial-roll;
								}
							
								if (initial2 > 100) {
									initial2=initial2-roll2;
								}
							
							// got ladder so rolling dice again
							roll11 = Math.floor((Math.random()*10) % 6)+1;
							roll = (int)roll11;
							roll12 = Math.floor((Math.random()*10) % 6)+1;
							roll2 = (int)roll12;
							
							initial= initial+roll;
							initial2= initial2+roll2;
							
								if (initial > 100) {
									initial=initial-roll;
								}
								
								if (initial2 > 100) {
									initial2=initial2-roll2;
								}
						
							if (initial == 100) {
								System.out.println("Player 1 Won the game at position "+initial);
								System.out.println("And Player 2 position= "+initial2);
								break;
								
							} else if (initial2 == 100){
								System.out.println("Player 2 Won the game at position "+initial2);
								System.out.println("And Player 1 position= "+initial);
								break;
							}
					
					} else if (option == 2 && option2 == 2 ) {
						// Its a snake
						initial= initial-roll;
						initial2= initial2-roll2;
						
					if ( initial < 0 && initial2 <0 ) {
						initial = 0;
						initial2 = 0;
					}
					
					}
	
				}
			}
}