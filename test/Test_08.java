class Test_08
{
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("小明");
		p1.setAge(18);
		p1.setGender("男");
		System.out.println(p1.getName() + "今年有" + p1.getAge() + "岁,是个" + p1.getGender() + "生");
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
		this.name = name; //此处将参数变量的值赋值给了 实例变量
	}

	public String getName() {
		return name; //返回的是实例变量
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge(){
		int age = 20; //如果方法体中存在 age 这个变量，则不会往上找同名变量
		return age;
	}

	public void setGender(String Gender){
		this.Gender = Gender;
	}
	public String getGender(){
		return Gender; //如果方法体中无 Gender 变量，则会逐级向上找，找到为止。
	}


}
