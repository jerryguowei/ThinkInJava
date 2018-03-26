package containers;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListPerformance {
   static Random rand=new Random();
   static int reps=1000;
   static List<Test<List<Integer>>> tests=new ArrayList<Test<List<Integer>>>();
   static List<Test<LinkedList<Integer>>> qTests = new ArrayList<Test<LinkedList<Integer>>>();
   static {
	   tests.add(new Test<List<Integer>>("add") {
		  @Override
		int test(List<Integer> list, TestParam tp) {
			int loops=tp.loops;
			int listSize=tp.size;
			for(int i=0; i<loops;i++){
			  list.clear();
			  for(int j=0;j<listSize;j++)
				  list.add(j);
			}
			return loops*listSize;
		}
	});
	   tests.add(new Test<List<Integer>>("set") {
		  @Override
		int test(List<Integer> list, TestParam tp) {
			int loops=tp.loops;
			int listSize=tp.size;
			for(int i=0; i<loops;i++){
			  list.clear();
			  for(int j=0;j<listSize;j++)
				  list.set(rand.nextInt(listSize),47);
			}
			return loops*listSize;
		}
	});
	   tests.add(new Test<List<Integer>>("iteradd") {
		   int test(List<Integer> list, TestParam tp) {
		     final int LOOPS = 1000000;
		     int half = list.size() / 2;
		     ListIterator<Integer> it = list.listIterator(half);
		     for(int i = 0; i < LOOPS; i++)
		       it.add(47);
		     return LOOPS;
   }
});
   }
}
