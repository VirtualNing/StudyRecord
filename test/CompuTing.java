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
		System.out.println("a++ + b= " + (b + a++)); //50 ��Ч�� 30 + 20����ɼӷ��� a+1
		System.out.println("++a + b= " + (++a + b)); //52 ��Ч�� 30 + (a+1)+1,��һ����a+1
		System.out.println("--a = " + (--a));// 21 ��Ч�� 22 - 1
		System.out.println("b-- = " + (b--)); // 30 �˿�b���� 30���������� -1 ����
		System.out.println("b = " + b); //29
	}
}