package functional;

import java.util.function.IntSupplier;

public class Closure1 {
  int i;
  IntSupplier makeFun(int x){
	  int k=0;
	   k++;
	   
	  return ()->x+i++;
  }
}
