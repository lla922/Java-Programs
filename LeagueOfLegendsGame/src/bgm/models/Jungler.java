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
	
	static {
		new Jungler("lee sin");
		new Jungler("khazix");
		new Jungler("rammuss");
		new Jungler("viego");
	}
	
	public static List<Jungler> getJungs() {
		return jungs;
	}

}
