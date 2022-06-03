package bgm.models;

import java.util.List;

public abstract class Champions<T> {
	
	private String name;
	private static List<Champions> champs;
	
	public Champions(String name) {
		this.name = name;
	}
	
	public void setChamps(List<Champions> champs) {
		this.champs = champs;
	}
	
	public static List<Champions> getChamps() {
		return champs;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}
