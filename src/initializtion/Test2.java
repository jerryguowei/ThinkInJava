package initializtion;

import java.util.Arrays;

class Bowl{
	public Bowl(int marker) {
		System.out.println("Bowl(" + marker +")");
	}
	void f1(int marker){
		System.out.println("f1(" + marker + ")");
	}
}
class Table{
	int n=f(2);
	static Bowl bow1=new Bowl(1);
	static int i=f(1);
	static int f(int i){
		System.out.println("static f()"+i);
		return 1;
	}
	public Table() {
		System.out.println("Table Contructor");
	}
	static {
		System.out.println("Table static");
	}
	static Bowl bow2=new Bowl(2);
}
public class Test2 {
   public static void main(String[] args){
	 Table t1=new Table();
	 int[] array=new int[10];
	 System.out.println(Arrays.toString(array));
//	 Bowl b2=Table.bow1;
   }
}
