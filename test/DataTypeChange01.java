public class DataTypeChange01
{
	//隐式类型转换/自动转换
	//规则是左边的数据类型取值范围 > 右边的数据类型取值范围
	public static void main(String[] args) {
		// int > short
		int num1;
		short num2 = 20000; //2000 默认是 int 类型，但是小于 short 能取得的最大值
		num1 = num2;
		System.out.println(num1);
		// short > byte
		short num3;
		byte num4 = 120;
		num3 = num4;
		System.out.println(num3);
		// long > int
		int num5 = 10086;
		long num6 = num5;
		System.out.println(num6);
		// float > long 
		long num7 = 100000L;
		float num8 = num7;
		System.out.println(num8);
		// double > float
		float num9 = 88.9F; //float 声明的类型数值后面必须带有字母 f 或者 F
		double num10 = num9;
		System.out.println(num10);
		// char 类型转换
		char s1 = ' ';
		int n1 = s1;
		System.out.println(n1);
		// 反过来，由大到小转换
		float num11 = 88.94F;
		//byte num12 = num11;
		//System.out.println(num12); // 错误: 不兼容的类型: 从float转换到byte可能会有损失

	}
}