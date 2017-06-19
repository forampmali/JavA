class Employeedetail
{
	int id;
	String name;	
	float salary;	
	void insert(int i,String n,float s)
	{
		id=i;
		name=n;
		salary=s;
	}
	void dispay()
	{
		System.out.println(id+" "+name+" "+salary);
	}
}
public class Employee 
{
	public static void main(String[] args) 
	{  
		Employeedetail e1=new Employeedetail();
		Employeedetail e2=new Employeedetail();
		Employeedetail e3=new Employeedetail();
		e1.insert(1, "Foram", 50000);
		e2.insert(2, "Prashant", 100000);
		e3.insert(3, "Foru", 55000);
		e1.dispay();
		e2.dispay();
		e3.dispay();
	}
}
