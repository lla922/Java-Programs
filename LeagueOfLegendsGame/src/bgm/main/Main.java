package bgm.main;
import bgm.main.*;
import bgm.models.*;

public class Main {

	public static void main(String[] args) {
			
		
		System.out.println("Attack damage carriers available :" + ADC.getAdcs().toString());
		System.out.println("\nSupports available :" + Support.getSups().toString());
		System.out.println("\nTop laners available :" + Top.getTops().toString());
		System.out.println("\nJunglers available " + Jungler.getJungs().toString());
		System.out.println("\nMid laners available : " + Mid.getMidLaners().toString());
		
		System.out.println("\n");
	
		
		Team team = new Team();
		
		System.out.println("the team created automatically is : " + team.createTeam() + " enemy team is :" + team.createEnemyTeam());

	}

}
