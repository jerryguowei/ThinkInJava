package io;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class LargeMappedFiles {
   static int length=0x8000000;
   public static void main(String[] args) throws Exception{
	   MappedByteBuffer out=new RandomAccessFile("test.dat", "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 10000, length/10);
	   for(int i=10000;i<length/10;i++)
		   out.put((byte)'m');
	   System.out.println("finished writing");
	   for(int i=length/20;i<length/20+6;i++)
		   System.out.println((char)out.get(i));
   }
}
