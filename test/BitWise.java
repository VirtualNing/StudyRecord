public class BitWise
{
	public static void main(String[] args) {
		int a = 20; //二进制为 00010100
		int b = 30; //二进制为 00011110
		int c;
		//按位与 &
		c = a & b;
		System.out.println("a & b = " + c); // 20
		// 按位或 |
		c = a | b;
		System.out.println("a | b = " + c); // 30
		// 按位异或 ^
		c = a ^ b;
		System.out.println("a ^ b = " +c); //10
		// 按位取反 ~
		c = ~a;
		System.out.println("~a = " + c); //-21
		// 按位左移
		c = a << 2;
		System.out.println("a << 2 = " + c); //80
		//按位右移
		c = a >> 2;
		System.out.println("a >> 2 = " + c ); // 5
		//按位右移补零
		c = a >>> 2;
		System.out.println("a >>> 2 = " + c );	//5
	}
}