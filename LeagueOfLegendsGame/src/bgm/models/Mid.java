package bgm.models;

import java.util.ArrayList;
import java.util.List;

public class Mid extends Champions {
	
	private String type;
	private static List<Mid> midLaners = new ArrayList<>();

	public Mid(String name, String type) {
		super(name);
		this.type = type;
		midLaners.add(this);
		// TODO Auto-generated constructor stub
	}
	
	static {
		new Mid("akali","assassin");
		new Mid("katarina","assassin");
		new Mid("zed","assassin");
		new Mid("leblanc","mage");
	}
	
	public static List<Mid> getMidLaners() {
		return midLaners;
	}

}
