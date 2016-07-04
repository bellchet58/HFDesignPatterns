package com.ublwarriors.templatemethod.sort;

public class Duck implements Comparable<Duck> {
	
	String name;
	int weight ;
	
	public Duck(String name, int weight)
	{
		this.name = name;
		this.weight = weight;
	}
	
	public String toString()
	{
		return name+" weighs " +weight;
	}
	
	@Override
	public int compareTo(Duck o) {
		Duck otherDuck = (Duck) o;
		if(this.weight < otherDuck.weight)
		{
			return -1;
		}else if(this.weight == otherDuck.weight)
		{
			return 0;
		}
		else{
			return 1;
		}
	}

}
