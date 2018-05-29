package functional;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class BiConsumerPermutations {
  static BiConsumer<Integer, Double> bicid=(i,d)->System.out.format("%d,%f%n",i,d);
  public static void main(String[] args){
	  Function<Integer, Double> fid=i->(double) i;
	  IntToDoubleFunction fid2=i->i;
	  System.out.println(fid2.applyAsDouble(12));
}
}
