package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class FileOutputShortCut {
   static String file="FormmatedMemoryInput.out";
   public static void main(String[] args) throws IOException{
	   BufferedReader in =new BufferedReader(new StringReader(BufferedInputFile.read("BasicFileOutput.out")));
	   PrintWriter out=new PrintWriter(file);
	   int lineCount=1;
	   String s;
	   while((s=in.readLine())!=null)
		   out.println(lineCount++ + ": " + s);
	   out.close();
	   System.out.println(BufferedInputFile.read(file));
	   
   }
}
