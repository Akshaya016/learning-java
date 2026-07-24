package methods;

public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student("akshu",18,9.12);
		student s2=new student("akshu");
		student s3=new student(20,"fred");
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.gpa);
		System.out.println(s1.isenrolled);
		System.out.println(s2.name);
		System.out.println(s3.name);
		System.out.println(s3.age);
		
		
	}

}

class student{
	String name;
	int age;
	double gpa;
	boolean isenrolled;
	student(String name,int age,double gpa){
		this.name=name;
		this.age=age;
		this.gpa=gpa;
		this.isenrolled=true;
		}
	//constructor overloading
	student(String name){
		this.name=name;
	}
	student(int age,String name)
	{
		this .age=age;
		this.name=name;
	}
	
	
	
	
}
