package bgm.model.Coffee;

public abstract class Coffee {
	
	private static long idCounter = 0;
	private final long id = ++idCounter; // 1 kere ataninca bir daha atanamasin
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName() + "-" + id;
	}

}
