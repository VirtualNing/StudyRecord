public class DataTypeCompet {
	//强制类型转换
	//左侧数据类型的取值范围可以小于等号右侧的数值
	//但会发生数据丢失现象
	// int < long
	public static void main(String[] args) {
		long num1 = 4294967296L;//等号右侧数值超出 int 所取得的最大值
		int num2 = (int)num1; 
		System.out.println(num2); //0 所以数据发生了丢失
		int num3 = 127; //byte 最大取值为 127
		byte num4 = (byte)num3; //127 = byte 所取最大值，故不会发生数据丢失现象
		System.out.println(num4); // 127
		//double --> byte
		byte num6 = (byte)89.987;
		System.out.println(num6); // 89 不是四舍五入而是直接将小数点后面所有数值都舍弃
		//数据运算，byte short char 会自动提升为 int 类型
		byte num01 = 20;
		short num02 = 40;
		char s01 = 'B'; // 大写字母 B 转换成 int 类型整数为 66
		short num03 = (short)(num01 + num02 + s01); // 相当于 int num01 + int num02 + 66 
		System.out.println(num03);
		// float 做运算
		float num04 = 88.97F; //float 数据类型必须再数据值后面添加字母 F，不然默认为 double 类型会报错
		float num05 = 76.78F;
		float num06 = num04 * num05;
		System.out.println(num06);
	}
}	