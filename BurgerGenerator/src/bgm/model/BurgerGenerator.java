package bgm.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class BurgerGenerator implements Generator<Burger>,Iterable<Burger> {
	
	private int generateCount;
	private static List<Class> burgers = new ArrayList<>();
	private Random random = new Random();
	
	public BurgerGenerator() {
		
	}
	
	public BurgerGenerator(int generateCount) {
		this();
		this.generateCount = generateCount;
	}
	
	public List<Class> BurgersList() {
		burgers.add(BBQburger.class);
		burgers.add(CheeseBurger.class);
		burgers.add(ChickenBurger.class);
		
		return burgers;
	}
	
	@Override
	public Iterator<Burger> iterator() {
		// TODO Auto-generated method stub
		return new BurgerIterator();
	}

	@Override
	public Burger next() {
		List<Class> a = BurgersList();
		
		//Object[] bbs = a.toArray();
		int index = random.nextInt(a.size());
		
		try {
			return (Burger) a.get(index).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	class BurgerIterator implements Iterator<Burger> {
		
		private int currentIndex = generateCount;

		@Override
		public boolean hasNext() {
			return currentIndex > 0;
		}

		@Override
		public Burger next() {
			currentIndex--;
			return BurgerGenerator.this.next();
		}
		
	}

}
