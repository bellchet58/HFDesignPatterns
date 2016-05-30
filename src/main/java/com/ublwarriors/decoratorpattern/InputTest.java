package com.ublwarriors.decoratorpattern;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javassist.ClassPath;

public class InputTest {
	public static void main(String[] args) throws IOException{
		int c;
		try{
			InputStream in = new LowerCaseInputStream(
									new BufferedInputStream(
											new FileInputStream(InputTest.class.getResource("/").getFile().toString()+"test.txt")));
			
			InputStream in2 = new FileInputStream(InputTest.class.getResource("/").getFile().toString()+"test.txt");
			in2 = new BufferedInputStream(in2);
			in2 = new LowerCaseInputStream(in2);
			
			while((c = in2.read()) >= 0)
			{
				System.out.print((char) c);
			}
			in.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
