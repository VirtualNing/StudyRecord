public class InstanceCounter {
	private static int numInstances = 0; //私有的静态 int 类型变量
	protected static int getCount() { //受保护的静态 int 类型整数方法,它返回的数据类型一定是 int
		return numInstances; //将变量直接返回
	}
	
	private static void addInstance() { //void 意思是无返回值
		numInstances++; //这个方法每调用一次就在原基础上加 1
	}

	InstanceCounter() { //这个方法默认是 public
		InstanceCounter.addInstance();//通过 类名.方法名 来调用其它方法
	}

	public static void main(String[] agrs) { //args 是 argsguments 缩写，参数集合
		System.out.println("初始值" + InstanceCounter.getCount());
		for(int i = 0; i < 600; i++) { //循环600次
			new InstanceCounter();//创建 InstanceCounter() 方法的实例，每创建一次实例，变量都跟随改变
		}//输出的是最后一次循环的结果
		System.out.println("循环后的值" + InstanceCounter.getCount()); //600
	}
}