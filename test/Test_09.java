public class Test_09
{
	public static void main(String[] args) {
		Person p1 = new Person(); //���� ���� ��Ϊ����������
		System.out.println("����Ϊ " + p1.getAge());
	}
}

class Person
{
	private int age = 10;

	private void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		this.setAge(30); //�����ڱ����еķ������ڵ������Ȿ���еķ���
		return age;
	}
}