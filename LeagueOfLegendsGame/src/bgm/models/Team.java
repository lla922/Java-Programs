package bgm.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import bgm.models.*;

public class Team<T extends Champions> {
	
	List<Champions> champsTeam1;
	List<Champions> champsTeam2;
	private Random random;
	
	public Team () {
		
		champsTeam1 = new ArrayList<>();
		champsTeam2 = new ArrayList<>();
		random = new Random();
	}
	
	
	
	
	public List<Champions> addChamps(List<Champions> a) {
		
		a.add(getRandomAdc());
		a.add(getRandomJungler());
		a.add(getRandomSupport());
		a.add(getRandomTop());
		a.add(getRandomMid());
		return a;
	}
	
	
	public List<Champions> firstTeam() {
		return champsTeam1;
	}
	
	public List<Champions> secondTeam() {
		champsTeam2 = team2DuplicateChecker();
		return champsTeam2;
	}
	
	
	
	public void createTeams() {
		champsTeam1 = addChamps(champsTeam1);
		champsTeam2 = addChamps(champsTeam2);
	}
	
	
	
	public List<Champions> team2DuplicateChecker(){
		
	createTeams();
		
		if( champsTeam1 != null) {
			
			for(int i = 0; i < champsTeam1.size(); i++) {
			while(champsTeam1.get(i).equals(champsTeam2.get(i))){
				if( i == 0 ) {
					champsTeam2.set(i, getRandomAdc());
				}else if(i == 1) {
					champsTeam2.set(i, getRandomJungler());
				}else if( i == 2) {
					champsTeam2.set(i, getRandomSupport());
				}else if ( i == 3 ) {
					champsTeam2.set(i, getRandomTop());
				}else {
					champsTeam2.set(i, getRandomMid());
				}
			}
			}
			
				
			return champsTeam2;
		} return null;
	}
	
	public Champions getRandomMid() {
		int indexMid = random.nextInt(Mid.getMidLaners().size());
		return Mid.getMidLaners().get(indexMid);
	}
	
	public Champions getRandomAdc() {
		
		int indexAdc = random.nextInt(ADC.getAdcs().size());
		return ADC.getAdcs().get(indexAdc);
			
	}
	
	
	public Champions getRandomSupport() {
		int indexSup = random.nextInt(Support.getSups().size());
		return Support.getSups().get(indexSup);
	}
	
	public Champions getRandomJungler() {
		int indexJung = random.nextInt(Jungler.getJungs().size());
		return Jungler.getJungs().get(indexJung);
		
		
	}
	
	public Champions getRandomTop() {
		int indexTop = random.nextInt(Top.getTops().size());
		return Top.getTops().get(indexTop);
	}

}
