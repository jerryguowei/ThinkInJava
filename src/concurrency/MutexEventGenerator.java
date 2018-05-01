package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MutexEventGenerator extends IntGenerator{
   private int currentEventValue=0;
   private Lock lock=new ReentrantLock();
   public int next(){
	   lock.lock();
	   try{
		   ++currentEventValue;
		   Thread.yield();
		   ++currentEventValue;
		   return currentEventValue;
	   }finally {
		lock.unlock();
	}
   }
   public static void main(String[] args){
	   EvenChecker.test(new MutexEventGenerator());
   }
}
