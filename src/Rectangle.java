class Rectangledetail{
	int lenght;
	int weight;
	void insert(int l,int w)
	{
		lenght= l;
		weight=w;
	}
	void calculateArea()
	{
		System.out.println(lenght * weight);
	}
}
public class Rectangle {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Rectangledetail rd1=new Rectangledetail();
		Rectangledetail rd2=new Rectangledetail();  
		  rd1.insert(12,5);  
		  rd2.insert(3,5);  
		  rd1.calculateArea();  
		  rd2.calculateArea();  
		
	}

}
