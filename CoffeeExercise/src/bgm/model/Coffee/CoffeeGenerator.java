package bgm.model.Coffee;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {

	
	
	private Class<?>[] coffees = { Americano.class , Cappucino.class , Filter.class , Brewed.class };
	
	private Random random;
	private int generateCount;
	
	public CoffeeGenerator() {
		random = new Random();
	}
		
	
	public CoffeeGenerator(int generateCount) {
		this();
		this.generateCount=generateCount;
	}
	
	@Override
	public Coffee next() {
		
		int index = random.nextInt(coffees.length);
		
		try {
			return (Coffee) coffees[index].newInstance();
		}catch(Exception ex){
			System.out.format("Exception :: %s", ex.getMessage());
		}
		return null;
		
	}
	
	public class CoffeeIterator implements Iterator<Coffee> {
		
		private int currentIndex = generateCount;
		

		@Override
		public boolean hasNext() {
			return currentIndex > 0;
		}

		@Override
		public Coffee next() {
			currentIndex--;
			return CoffeeGenerator.this.next();
		}
		
	}

	@Override
	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}

	
	
}
