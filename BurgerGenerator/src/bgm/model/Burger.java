package bgm.model;

public abstract class Burger {
	
	private static long idCounter = 0;
	private final long ID = idCounter++;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + " - " + ID; 
		}
	

}
