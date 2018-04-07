package concurrency;


public class Phone implements Runnable{
	private int number=0;
	private static int numberCount=0;
	private  int id=numberCount++;
	public Phone() {
		System.out.println("inside the constructor");
	}
	private String status(){
		return "#"+ id+ "=>"+ number++ + " ";
	}
	
	@Override
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println(status());
			Thread.yield();
		}
		System.out.println(id+ "task finished!");
	}

}
