package functional;

import java.util.function.Function;

class I {
	@Override
	public String toString(){
		return "I";
	}
}
class O {
	@Override
	public String toString(){
		return "O";
	}
}
class C {
	@Override
	public String toString(){
		return "C";
	}
}
public class TransformFunction {
       static Function<I, C> transform(Function<I,O> in){
    	   return in.andThen(o->{
    		   System.out.println(o);
    		   return new C();
    	   });
       }
       public static void main(String[] args){
    	   Function<I, C> f2=transform(i->{
    		   System.out.println(i);
    		   return new O();
    	   });
    	   C c=f2.apply(new I());
    	   System.out.println(c);
       }
}
