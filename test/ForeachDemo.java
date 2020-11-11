public class ForeachDemo 
{
	public static void main(String[] args) 
	{
		int[] numbers = {23,45,6,76,81}; // 声明 int 类型的 数组
		/*Demo d1 = new Demo();
		d1.f(numbers);
		d1.x(o());*/

		Demo d1 = new Demo(numbers);
		Demo d2 = new Demo(o());
	}
	public static String[] o() { //这是个返回数组的方法
			String[] sub = {"bule","yellow","white","color","xixi"};
			return sub;
	}
}

class Demo
{
	//返回 int 类型数组 的构造方法
	Demo(int[] n) {
		this.f(n);
	}
	//返回 String 类型数组 的构造方法
	Demo(String[] s) {
		this.x(s);
	}
	public void f(int[] num) { //参数是 int 类型的数组
		//循环
		for(int item: num) {
			item += 2;
			System.out.println(item);
		}
	}

	public void x(String[] s) {
		for(String item: s) {
			System.out.println(item);
		}
	}

}
