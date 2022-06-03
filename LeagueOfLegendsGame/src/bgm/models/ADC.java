package bgm.models;

import java.util.ArrayList;
import java.util.List;

public class ADC extends Champions{
	
	private String rangeSeverity;
	private static List<Champions> adcs = new ArrayList<>();
	
	public ADC(String name , String rangeSeverity) {
		super(name);
		this.rangeSeverity = rangeSeverity;
		adcs.add(this);
		// TODO Auto-generated constructor stub
	}
	
	static {
		new ADC("caitlyn", "severe");
		new ADC ("MF", "middle");
		new ADC ("twitch", " middle ");
		new ADC("ezreal" , "severe");
	}
	
	public static List<Champions> getAdcs() {
		
		return adcs;
	}
	
	
	
	
	
	

}
