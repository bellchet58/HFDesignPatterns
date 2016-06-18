package com.ublwarriors.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
	
	public boolean customerWantsCondiments()
	{
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y"))
		{
			return true;
		}else {
			return false;
		}
	}
	
	public String getUserInput()
	{
		String answer = null;
		System.out.println("Would you like milk and sugar with your coffee (y/n)?");
		Scanner sc = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			answer = in.readLine();
		}catch(IOException ioe)
		{
			System.out.println("IO error trying to read your answer");
		}
		if(answer == null)
		{
			return "no";
		}
		return answer;
	}

}
