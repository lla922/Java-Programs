package bgm.model.Coffee;

import java.util.ArrayList;

public class FibonacciGenerator implements Generator<Integer>{
	
	/*
	 * recursive method call
	 */
	
	private int nth;
	public ArrayList<Integer> fibNum;
	

	@Override
	public Integer next() {
		fibNum.add(fibonacci(nth++));
		return fibonacci(nth++);
	}
	
	
	private int fibonacci(int n) {
		
		if(n < 2) {
			
			return 1;
		}
		
		return fibonacci(n - 2) + fibonacci(n - 1);
		
	}
	
	
	

}
