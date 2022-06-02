package bgm.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import bgm.models.*;

public class Team<T> {
	
	List<T> champsTeam;
	
	private Random random;
	
	public Team () {
		champsTeam = new ArrayList<>();
		random = new Random();
	}
	
	
	public List<T> createTeam() {
		List<T> a = new ArrayList<>();
		
		a.add((T) getRandomAdc());
		a.add((T) getRandomJungler());
		a.add((T) getRandomSupport());
		a.add((T) getRandomTop());
		a.add((T) getRandomMid());
		return a;
	}
	
	public List<T> createEnemyTeam(){
		if( champsTeam != null) {
			List<T> enemyTeam = createTeam();
			return enemyTeam;
		} return null;
	}
	
	public Mid getRandomMid() {
		int indexMid = random.nextInt(Mid.getMidLaners().size());
		return Mid.getMidLaners().get(indexMid);
	}
	
	public ADC getRandomAdc() {
		
		int indexAdc = random.nextInt(ADC.getAdcs().size());
		return ADC.getAdcs().get(indexAdc);
			
	}
	
	
	public Support getRandomSupport() {
		int indexSup = random.nextInt(Support.getSups().size());
		return Support.getSups().get(indexSup);
	}
	
	public Jungler getRandomJungler() {
		int indexJung = random.nextInt(Jungler.getJungs().size());
		return Jungler.getJungs().get(indexJung);
	}
	
	public Top getRandomTop() {
		int indexTop = random.nextInt(Top.getTops().size());
		return Top.getTops().get(indexTop);
	}

}
