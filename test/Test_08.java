class Test_08
{
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("С��");
		p1.setAge(18);
		p1.setGender("��");
		System.out.println(p1.getName() + "������" + p1.getAge() + "��,�Ǹ�" + p1.getGender() + "��");
	}
}
class Person
{
	private String name;
	private int age;
	private String Gender;
	/*Person(){};
	Person(String name, int age, String Gender) {
		this.name = name;
		this.age = age;
		this.Gender = Gender;
	}*/

	public void setName(String name) {
		this.name = name; //�˴�������������ֵ��ֵ���� ʵ������
	}

	public String getName() {
		return name; //���ص���ʵ������
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge(){
		int age = 20; //����������д��� age ����������򲻻�������ͬ������
		return age;
	}

	public void setGender(String Gender){
		this.Gender = Gender;
	}
	public String getGender(){
		return Gender; //������������� Gender ����������������ң��ҵ�Ϊֹ��
	}


}
