public class SumDemo01
{
	public static void main(String[] agrs) {
		Sum s1 = new Sum();
		System.out.println("1-100累加和 = " + s1.sum(1,100));
	}
}

class Sum
{
	Sum() {}
	public static int sum(int a, int b) {
		//求 1-100之和
		int temp = 0;
		while (a <= b)
		{
			temp += a;
			a++;
		}
		return temp;
	} 
}