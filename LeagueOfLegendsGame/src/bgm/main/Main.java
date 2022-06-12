package bgm.main;
import java.util.List;

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
	
		
		SetGame newVs = new SetGame();
		
		System.out.println(newVs.firstTeam() + " -- " + newVs.secondTeam());
		
		SetGame newVs2 = new SetGame();
		
		System.out.println(newVs2.firstTeam() + "--" + newVs2.secondTeam());
		
		
		char a = 65;
		
		char b = 55;
		
		int x = a+b;
		
		
		

	}

}
