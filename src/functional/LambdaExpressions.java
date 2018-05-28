package functional;

interface Description{
	String brief();
}
interface Body{
	String detailed(String head);
}
interface Multi{
	String towArg(String head,Double d);
}
public class LambdaExpressions {
	static Body bod=h->h + " No Parents!";
	static Body bod2=(h)-> h + "more details";
	static Description desc=()->"short info";
	static Multi mult=(h,n)->h+n;
	static Description morelines=()->{
		System.out.println("moreLines()");
		return "from moreLines()";
	};
	public static void main(String[] args){
		System.out.println(bod.detailed("Oh!"));
		System.out.println(bod2.detailed("Hi!"));
		System.out.println(desc.brief());
		System.out.println(mult.towArg("Pi!", 3.14159));
		System.out.println(morelines.brief());
	}

}
