package ClassObjectMethod;

public class StudentMain 
{
	public static void main(String args[])
	{
		//Using Object reference
	/*	Student s1=new Student();
		s1.Sid=1;
		s1.School="holy mother high school";
		s1.printdata();
		Student s2=new Student();
		s2.Sid=2;
		s2.School="holy father high school";
		s2.printdata();  
		
		
		//Using method
		s1.setdata(101,"viveka","hhudh");
		s1.printdata(); */
		
		//Using Constructors
		Student s1=new Student(101, "David","jefkj");
		s1.printdata();
	}
}
