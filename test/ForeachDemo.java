public class ForeachDemo 
{
	public static void main(String[] args) 
	{
		int[] numbers = {23,45,6,76,81}; // ���� int ���͵� ����
		/*Demo d1 = new Demo();
		d1.f(numbers);
		d1.x(o());*/

		Demo d1 = new Demo(numbers);
		Demo d2 = new Demo(o());
	}
	public static String[] o() { //���Ǹ���������ķ���
			String[] sub = {"bule","yellow","white","color","xixi"};
			return sub;
	}
}

class Demo
{
	//���� int �������� �Ĺ��췽��
	Demo(int[] n) {
		this.f(n);
	}
	//���� String �������� �Ĺ��췽��
	Demo(String[] s) {
		this.x(s);
	}
	public void f(int[] num) { //������ int ���͵�����
		//ѭ��
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
