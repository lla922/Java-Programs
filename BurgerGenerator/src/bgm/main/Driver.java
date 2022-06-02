package bgm.main;
import bgm.model.*;

public class Driver {
	
	
	public static void main(String[] args) {
		
		//BBQburger b = new BBQburger();
		
		//System.out.println(b);
		
		BurgerGenerator aa = new BurgerGenerator(10);
		
		//Burger burger = aa.next();
		
		//System.out.println(burger);
		
		System.out.println(aa.next());
		System.out.println(aa.next());
		System.out.println(aa.next());
		System.out.println(aa.next());
		
	
	
//	for(Burger burger : new BurgerGenerator(10)) {
//		System.out.println(burger);
//	}
	
}

}
