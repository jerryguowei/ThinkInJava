package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIPCompress {
   public static void main(String[] args) throws IOException{
	   if(args.length==0){
		   System.out.println("Usage: \nGZIPcompress file\n" + "\tUses GZIP compression to compress"+"the file to test.gz");
		   System.exit(1);
	   }
	   InputStream in=new BufferedInputStream(new FileInputStream(args[0]));
	   BufferedOutputStream out=new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("test.gz")));
	   System.out.println("writing file");
	   int c;
	   while((c=in.read())!=-1)
		   out.write(c);
	   in.close();
	   out.close();
	   System.out.println("Reading file");
	   BufferedReader in2=new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("test.gz"))));
	   String s;
	   while((s=in2.readLine())!=null)
		   System.out.println(s);
   }
   
}
