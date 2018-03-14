package generics;

import java.util.ArrayList;
import java.util.List;


public class GenericAndCovariance {
 public static void main(String[] args){
	 List<? extends Fruit> fList=new ArrayList<Apple>();
//	 fList.add(new Object());
 }
}
