package bgm.models;

import java.util.ArrayList;
import java.util.List;

public class Top extends Champions{
	

	private static List<Top> tops = new ArrayList<>();

	public Top(String name) {
		super(name);
		tops.add(this);
		
		// TODO Auto-generated constructor stub
	}
	
	static {
		new Top("mordekaiser");
		new Top("irelia");
		new Top("fiora");
		new Top("Gwen");
	}
	
	public static List<Top> getTops() {
		return tops;
	}
	
	
}
