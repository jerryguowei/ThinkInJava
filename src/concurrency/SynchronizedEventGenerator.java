package concurrency;

public class SynchronizedEventGenerator extends IntGenerator {
   private int currentEventValue=0;
   public synchronized int next(){
	   ++currentEventValue;
	   Thread.yield();
	   ++currentEventValue;
	   return currentEventValue;
   }
   public static void main(String[] args){
	   EvenChecker.test(new SynchronizedEventGenerator());
   }
}
