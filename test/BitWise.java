public class BitWise
{
	public static void main(String[] args) {
		int a = 20; //������Ϊ 00010100
		int b = 30; //������Ϊ 00011110
		int c;
		//��λ�� &
		c = a & b;
		System.out.println("a & b = " + c); // 20
		// ��λ�� |
		c = a | b;
		System.out.println("a | b = " + c); // 30
		// ��λ��� ^
		c = a ^ b;
		System.out.println("a ^ b = " +c); //10
		// ��λȡ�� ~
		c = ~a;
		System.out.println("~a = " + c); //-21
		// ��λ����
		c = a << 2;
		System.out.println("a << 2 = " + c); //80
		//��λ����
		c = a >> 2;
		System.out.println("a >> 2 = " + c ); // 5
		//��λ���Ʋ���
		c = a >>> 2;
		System.out.println("a >>> 2 = " + c );	//5
	}
}