package bgm.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import bgm.models.*;

public class Team<Champions> {
	
	List<Champions> champsTeam;
	
	private Random random;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	public Team () {
		champsTeam = new ArrayList<>();
		random = new Random();
	}
	
	
	public List<Champions> createTeam() {
		List<Champions> a = new ArrayList<>();
		
		a.add((Champions) getRandomAdc());
		a.add((Champions) getRandomJungler());
		a.add((Champions) getRandomSupport());
		a.add((Champions) getRandomTop());
		return a;
	}
	
	public List<Champions> createEnemyTeam(){
		if( champsTeam != null) {
			List<Champions> enemyTeam = createTeam();
			return enemyTeam;
		} return null;
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
