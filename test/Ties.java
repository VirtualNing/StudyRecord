public class Ties
{
	public static void main(String[] agrs) {
		int a = 10;
		int b = 20;
		// 判断 a 与 b 数值是否相等，如果相等，返回 true，否则返回 false
		System.out.println("a == b is " + (a == b)); //false
		//判断 a 与 b 数值是否不相等，如果不相等，返回 true，相等返回 false
		System.out.println("a != b is " + (a != b)); //true
		// 判断 a 是否大于 b,如果大于，返回 true，否则返回 false
		System.out.println("a > b is " + (a > b)); // false
		// 判断 a 是否小于 b,如果小于，返回 true，否则返回 false
		System.out.println("a < b is " + (a < b)); // true
		// 判断 a 是否大于或者等于 b,如果大于或者等于，返回 true，否则返回 false
		System.out.println("a >= b is " + (a >= b)); // false
		// 判断 a 是否小于或者等于 b,如果小于或者等于，返回 true，否则返回 false
		System.out.println("a <= b is " + (a <= b)); // true
	}
}