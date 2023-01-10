
public class mainChallenges {

	public static void main(String[] args) {
		Player p[] = new Player[6];
		p[0] = new Player("Pretty Boy", "France", 31, 1.75f, 68.9f, 11, 2, 1);
		p[1] = new Player("Putscript", "Brasil", 29, 1.68f, 67.8f, 14, 2, 3);
		p[2] = new Player("Snapshadow", "USA", 35, 1.65f, 80.9f, 12, 2, 1);
		p[3] = new Player("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
		p[4] = new Player("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		p[5] = new Player("Nerdart", "USA", 30, 1.81f, 105.7f, 12, 2, 4);		
				
		Challenge fight1 = new Challenge();
		fight1.scheduleFight(p[0], p[1]);
		fight1.fight();
		
		p[0].status();
		p[1].status();
		
	}

}
