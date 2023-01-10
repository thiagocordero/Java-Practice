import java.util.Random;

public class Challenge {
	
	//Attributes
	private Player player1;
	private Player player2;
	private int rounds;
	private boolean valid;
	
	//General Methods
	
	public void scheduleFight(Player player1, Player player2) {
		if (player1.getCategory().equals(player2.getCategory())
				&& player1 != player2) {
			this.valid = true;
			this.player1 = player1;
			this.player2 = player2;
		} else {
			this.valid = false;
			this.player1 = null;
			this.player2 = null;
		}		
	}
	
	public void fight() {
		if (this.valid) {
			System.out.println("----- PLAYER 1 -----");
			player1.presentation();
			System.out.println("----- PLAYER 2 -----");
			player2.presentation();
			System.out.println("----- FIGHT!!! -----");
			
			Random num = new Random();
			int winner = num.nextInt(3);
			switch(winner) {
			case 0: // TIE
				System.out.println("It's a TIE!");
				this.player1.draw();
				this.player2.draw();
				break;
			case 1:
				System.out.println(this.player1.getName() + " WINS!");
				this.player1.win();
				this.player2.lose();
				break;
			case 2:
				System.out.println(this.player2.getName() + " WINS!");
				this.player2.win();
				this.player1.lose();
				break;
			}
	
		} else {
			System.out.println("This fight can't happen due to different categories.");
		}
		
	}
	
	
	//Getters e Setters
	public Player getPlayer1() {
		return player1;
	}
	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}
	
	public Player getPlayer2() {
		return player2;
	}
	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}


}
