public class ThisExample 
{
	public static void main(String[] args) 
	{
		//���ù��췽��
		Person p1 = new Person("����");
		Person p2 = new Person("���",27);
		System.out.println(p1 + "��һ�ε���");
		System.out.println(p2);
		System.out.println(p1 + "�ڶ��ε���");
	}
}

class Person
{
	private int age;
	private String name;
	private String sName;
	// �����޲ι��췽��
	Person() {};
	// ����ֻ��һ�������Ĺ��췽��
	Person(String name) {
		this.name = name;
		this.sName = name;
	}
	//���������������Ĺ��췽��
	Person(String name, int age) {
		this("����");
		this.name = name;
		this.age = age;
		// this(); ����: ��this�ĵ��ñ����ǹ������еĵ�һ�����
	}
	//��������ֵ�ķ���
	public String toString() {
		return ("�ҽ� " + name + ",���� " + age + "��," + sName);
	}
}
