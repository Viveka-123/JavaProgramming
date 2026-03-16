 package ClassObjectMethod;

public class Student 
{
	int Sid;
	String Sname="viveka";
	String School="holy mother high school";
	
	void printdata()
	{
		System.out.println(Sid+" "+Sname+" "+School);
	}
	
	void setdata(int id, String name, String nSchool)
	{
		Sid=id;
		Sname=name;
		School=nSchool;
	}
	
	Student(int id, String name, String nSchool)    ///Constructor
	{
		Sid=id;
		Sname=name;
		School=nSchool;
	}

}
