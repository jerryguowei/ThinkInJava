package concurrency;

public class AnotherMain {
   public static void main(String[] args){
	   for(int i=0;i<15;i++)
		   new Thread(new Phone()).start();
	   System.out.println("Waiting phone ended!");
   }
}
