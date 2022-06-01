package bgm.models;

import java.util.ArrayList;
import java.util.List;

public class Jungler extends Champions{
	
	private static List<Jungler> jungs = new ArrayList<>();

	public Jungler(String name) {
		super(name);
		jungs.add(this);
		// TODO Auto-generated constructor stub
	}
	
	public static List<Jungler> getJungs() {
		return jungs;
	}

}
