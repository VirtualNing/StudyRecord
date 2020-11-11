public class ThisExample 
{
	public static void main(String[] args) 
	{
		//调用构造方法
		Person p1 = new Person("李明");
		Person p2 = new Person("李白",27);
		System.out.println(p1 + "第一次调用");
		System.out.println(p2);
		System.out.println(p1 + "第二次调用");
	}
}

class Person
{
	private int age;
	private String name;
	private String sName;
	// 创建无参构造方法
	Person() {};
	// 创建只有一个参数的构造方法
	Person(String name) {
		this.name = name;
		this.sName = name;
	}
	//创建有两个参数的构造方法
	Person(String name, int age) {
		this("琪琪");
		this.name = name;
		this.age = age;
		// this(); 错误: 对this的调用必须是构造器中的第一个语句
	}
	//创建返回值的方法
	public String toString() {
		return ("我叫 " + name + ",今年 " + age + "岁," + sName);
	}
}
