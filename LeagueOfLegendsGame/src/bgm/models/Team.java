package bgm.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import bgm.models.*;

public class Team<T extends Champions> {
	
	List<T> champsTeam;
	
	private Random random;
	
	public Team () {
		champsTeam = new ArrayList<>();
		random = new Random();
	}
	
	
	public List<Champions> createTeam() {
		List<Champions> a = new ArrayList<>();
		
		a.add(getRandomAdc());
		a.add(getRandomJungler());
		a.add(getRandomSupport());
		a.add(getRandomTop());
		a.add(getRandomMid());
		return a;
	}
	
	public List<Champions> createEnemyTeam(){
		if( champsTeam != null) {
			List<Champions> enemyTeam = createTeam();
			return enemyTeam;
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
