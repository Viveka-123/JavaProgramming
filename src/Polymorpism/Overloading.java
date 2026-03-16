package Polymorpism;

public class Overloading 
{

	int a=10, b=20, c=30;
	void sum()
	{
		System.out.println(a+b);         
	}
	
	void sum(int a, int b)                    //Order of datatype arguements
	{
		System.out.println(a*b);         
	}
	void sum(int a, double b)                //different datatype parameters
	{
		System.out.println(a+b);        
	}
	void sum(int a, double b, int c)           //Number of datatype parameters
	{
		System.out.println(a+b+c);        
	}
	public static void main(String[] args) 
	{
		Overloading ol=new Overloading();
		ol.sum();
	    ol.sum(12,23);
		ol.sum(10,11.52);
		ol.sum(12,23.2, 34);
	}

}
