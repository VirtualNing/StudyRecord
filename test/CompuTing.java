public class CompuTing
{
	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		System.out.println("a+b = " + (a+b)); //50
		System.out.println("a-b = " + (a-b)); //-10
		System.out.println("a*b = " + (a*b)); //600
		System.out.println("b/a = " + ((double)(b/a))); //1.0
		System.out.println("b%a = " + (b%a)); //10
		System.out.println("a++ + b= " + (b + a++)); //50 等效于 30 + 20，完成加法后 a+1
		System.out.println("++a + b= " + (++a + b)); //52 等效于 30 + (a+1)+1,上一步骤a+1
		System.out.println("--a = " + (--a));// 21 等效于 22 - 1
		System.out.println("b-- = " + (b--)); // 30 此刻b还是 30，后面再做 -1 运算
		System.out.println("b = " + b); //29
	}
}