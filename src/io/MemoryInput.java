package io;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
	public static void main(String[] args) throws IOException{
		String a=BufferedInputFile.read("MemoryInput.java");
		StringReader in=new StringReader(a);
		int c;
		while ((c=in.read())!=-1) {
			System.out.print((char)c);
		}
	}

}
