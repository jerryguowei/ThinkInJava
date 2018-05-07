package interfaces;

public interface StringProcessor extends Processor{
  @Override
  String process(Object input);
  String S = // [2] 
		  "If she weighs the same as a duck, " +
		  "she's made of wood" ; 
     static void main ( String [] args) { 
    	 // [3] 
    	 Applicator. apply ( new Upcase (), S);
    	 Applicator. apply ( new Downcase (), S);
    	 Applicator. apply ( new Splitter (), S); 
    	 
     } 
     
 }
