public class  TestWorker
{
	public static void main(String[] args) 
	{
		// ���ô���һ�������Ĺ��췽��
		Worker w1 = new Worker("����");
		// ���ô������������Ĺ��췽��
		Worker w2 = new Worker("����",19);
		System.out.println(w1);
		System.out.println(w2);
	}
}

class Worker
{
	private String name;
	private int age;
	// �����һ�������Ĺ��췽��
	public Worker(String name) {
		this.name = name;
	}
	//��������������Ĺ��췽��
	public Worker(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//����һ�� toString ����
	/*
	 *Object �����һ�� toString() �������÷����Ǹ�����ķ�����
	 *������ÿ���඼��̳и÷�����������һ�� String ���͵��ַ���
	 *���һ�����ж����˸÷��������ڵ��ø������ʱ��
	 *�����Զ����ø������� toString() ��������һ���ַ���
	*/
	public String toString() {
		return ("�ҽ�" + name + ",����" + age + "��");
	}
}
