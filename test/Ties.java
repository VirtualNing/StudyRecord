public class Ties
{
	public static void main(String[] agrs) {
		int a = 10;
		int b = 20;
		// �ж� a �� b ��ֵ�Ƿ���ȣ������ȣ����� true�����򷵻� false
		System.out.println("a == b is " + (a == b)); //false
		//�ж� a �� b ��ֵ�Ƿ���ȣ��������ȣ����� true����ȷ��� false
		System.out.println("a != b is " + (a != b)); //true
		// �ж� a �Ƿ���� b,������ڣ����� true�����򷵻� false
		System.out.println("a > b is " + (a > b)); // false
		// �ж� a �Ƿ�С�� b,���С�ڣ����� true�����򷵻� false
		System.out.println("a < b is " + (a < b)); // true
		// �ж� a �Ƿ���ڻ��ߵ��� b,������ڻ��ߵ��ڣ����� true�����򷵻� false
		System.out.println("a >= b is " + (a >= b)); // false
		// �ж� a �Ƿ�С�ڻ��ߵ��� b,���С�ڻ��ߵ��ڣ����� true�����򷵻� false
		System.out.println("a <= b is " + (a <= b)); // true
	}
}