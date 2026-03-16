package ClassObjectMethod;

public class ConstructorMain {

		int x, y;
		
		ConstructorMain()            //default Constructor
		{
			x=100;
			y=200;
		}
		
		ConstructorMain(int a, int b)    //Parameterized Constructor
		{
			x=a;
			y=b;
		}
		
		void add()
		{
			System.out.println(x+y);
		}
		
		
	public static void main(String[] args)
	{
		ConstructorMain cm=new ConstructorMain(10,20);
		cm.add();
	}
	
}
