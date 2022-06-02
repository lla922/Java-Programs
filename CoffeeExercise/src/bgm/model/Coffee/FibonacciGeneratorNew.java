package bgm.model.Coffee;

import java.util.ArrayList;
import java.util.Iterator;

public class FibonacciGeneratorNew extends FibonacciGenerator implements Iterable<Integer> {

	FibonacciGenerator a = new FibonacciGenerator();
	
	 
	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return super.next();
	}

	
	
	class fibIterator implements Iterator<Integer>{
		
		
		private int currentIndex;

		@Override
		public boolean hasNext() {
			return currentIndex < fibNum.size();
		}

		@Override
		public Integer next() {
			return a.next();
		}
		
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new fibIterator();
	}
}
