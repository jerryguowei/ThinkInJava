package generics;

import java.util.Iterator;

public class InterableFibonacci extends Fibonacci implements Iterable<Integer>{
    private int n;
  public InterableFibonacci(int count) {
	   n=count;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		
		return new Iterator<Integer>() {
			public boolean hasNext(){
				return n>0;
			}
			public Integer next(){
				n--;
				return InterableFibonacci.this.next();
			}
		};
	}
	public static void main(String[] args){
		for(int i:new InterableFibonacci(18))
			System.out.println(i);
	}

}
