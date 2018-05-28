package functional;

class X {
	String f() {
		return "X::f()";
	}
}
interface MakeString {
	String make();
}
interface TransformX{
	String TransformX(X x);
}

public class UnboundMethodReference {
  public static void main(String[] args){
	  //MakeString ms=X::f;
	  TransformX sp=X::f;
	  X x=new X();
	  System.out.println(sp.TransformX(x));
	  System.out.println(x.f());
  }
}
