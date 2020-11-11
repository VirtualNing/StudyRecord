public class  TestWorker
{
	public static void main(String[] args) 
	{
		// 调用带有一个参数的构造方法
		Worker w1 = new Worker("丽丽");
		// 调用带有两个参数的构造方法
		Worker w2 = new Worker("李磊",19);
		System.out.println(w1);
		System.out.println(w2);
	}
}

class Worker
{
	private String name;
	private int age;
	// 定义带一个参数的构造方法
	public Worker(String name) {
		this.name = name;
	}
	//定义带两个参数的构造方法
	public Worker(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//定义一个 toString 方法
	/*
	 *Object 类具有一个 toString() 方法，该方法是个特殊的方法，
	 *创建的每个类都会继承该方法，它返回一个 String 类型的字符串
	 *如果一个类中定义了该方法，则在调用该类对象时，
	 *将会自动调用该类对象的 toString() 方法返回一个字符串
	*/
	public String toString() {
		return ("我叫" + name + ",今年" + age + "岁");
	}
}
