package concurrency;

public class MainThread {
	public static void main(String[] args){
		LiftOff launch=new LiftOff(1000);
		launch.run();
	}

}
