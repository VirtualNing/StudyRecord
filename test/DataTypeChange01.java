public class DataTypeChange01
{
	//��ʽ����ת��/�Զ�ת��
	//��������ߵ���������ȡֵ��Χ > �ұߵ���������ȡֵ��Χ
	public static void main(String[] args) {
		// int > short
		int num1;
		short num2 = 20000; //2000 Ĭ���� int ���ͣ�����С�� short ��ȡ�õ����ֵ
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
		float num9 = 88.9F; //float ������������ֵ������������ĸ f ���� F
		double num10 = num9;
		System.out.println(num10);
		// char ����ת��
		char s1 = ' ';
		int n1 = s1;
		System.out.println(n1);
		// ���������ɴ�Сת��
		float num11 = 88.94F;
		//byte num12 = num11;
		//System.out.println(num12); // ����: �����ݵ�����: ��floatת����byte���ܻ�����ʧ

	}
}