public class  Local
{
	public void local_a(){
		int num1 = 100,num2;
		num2 = num1 + 20;
		System.out.println(num2);
	}
	public static void main(String[] args) 
	{
		Local l = new Local();
		l.local_a();
	}
}
