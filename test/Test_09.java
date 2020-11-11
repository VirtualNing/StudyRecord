public class Test_09
{
	public static void main(String[] args) {
		Person p1 = new Person(); //以类 声明 作为变量的类型
		System.out.println("年龄为 " + p1.getAge());
	}
}

class Person
{
	private int age = 10;

	private void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		this.setAge(30); //可以在本类中的方法体内调用任意本类中的方法
		return age;
	}
}