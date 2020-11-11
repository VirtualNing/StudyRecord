public class Demo01Const
{
	public static void main(String[] args) {
		//整数常量输出
		System.out.println(123);
		System.out.println(-23);
		//浮点数常量
		System.out.println(-2.3f);
		System.out.println(3.201d);
		//字符常量
		//System.out.println('');//字符常量有且只有一个字符
		System.out.println('中');
		//System.out.println('ad');//字符常量有且只有一个字符
		System.out.println('\u0000');//字符常量可以是Unicode转义字符
		//字符串常量
		System.out.println("");//字符串常量可以为空
		System.out.println("\u0200");//字符串常量可以是Unicode转义字符
		System.out.println("a5ghj");
		//布尔常量
		System.out.println(false);
		System.out.println(true);
		//null 常量
		//System.out.println(null);空常量不能直接打印
	}
}