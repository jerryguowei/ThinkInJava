package functional;

import java.util.function.Function;

public class FunctionWithWrapped {
    public static void main(String[] args){
    	Function<Integer, Double> fid=i->(double)i;
    	IntToDoubleFunction fid2=i->i;
    	System.out.println(fid2.applyAsDouble(12));
    }
}
