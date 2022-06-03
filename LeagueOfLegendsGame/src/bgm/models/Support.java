package bgm.models;

import java.util.ArrayList;
import java.util.List;

public class Support extends Champions {
	
	public String type;
	private static List<Support> sups = new ArrayList<>();

	public Support(String name,String type) {
		super(name);
		this.type = type;
		sups.add(this);
		// TODO Auto-generated constructor stub
	}
	
	static {
		new Support("Sona", "healer");
		new Support ("Soraka", "healer");
		new Support ("lulu", " healer");
		new Support("yuumi" , "healer");
	}
	
	public static List<Support> getSups() {
		return sups;
	}
	
	
	
	
	 
	}


