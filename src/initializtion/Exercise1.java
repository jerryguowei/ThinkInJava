package initializtion;

public class Exercise1 {
  String ref;
  String ref2="ref2";
  String ref3;
  public Exercise1(){
	  ref3="ref3";
  }
  public static void main(String[] args){
	  Exercise1 a=new Exercise1();
	  System.out.println(a.ref);
	  System.out.println(a.ref2);
	  System.out.println(a.ref3);
  }
}
