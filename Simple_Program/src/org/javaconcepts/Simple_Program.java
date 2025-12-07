package org.javaconcepts;

public class Simple_Program {

	
	public void add()
	{
		System.out.println("Addition");
		//System.out.println(1);
		System.out.println(1+3);
		
	}
	
	public static void main(String[] args) 
	{
		//classname ref/objname = new classname();
		Simple_Program k = new Simple_Program();
		k.add();
		k.sub();
		k.multiply();
		k.division();
		
		}
	
	public void sub ()
	{
		System.out.println("Subtraction");
		System.out.println(78-8);
	}
	
	public void multiply ()
	{
		System.out.println("Multiply");
		System.out.println(5*7);
	}
	
	public void division ()
	{
		System.out.println("Division");
		System.out.println(35/2);
	}
}
