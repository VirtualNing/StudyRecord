public class DataTypeCompet {
	//ǿ������ת��
	//����������͵�ȡֵ��Χ����С�ڵȺ��Ҳ����ֵ
	//���ᷢ�����ݶ�ʧ����
	// int < long
	public static void main(String[] args) {
		long num1 = 4294967296L;//�Ⱥ��Ҳ���ֵ���� int ��ȡ�õ����ֵ
		int num2 = (int)num1; 
		System.out.println(num2); //0 �������ݷ����˶�ʧ
		int num3 = 127; //byte ���ȡֵΪ 127
		byte num4 = (byte)num3; //127 = byte ��ȡ���ֵ���ʲ��ᷢ�����ݶ�ʧ����
		System.out.println(num4); // 127
		//double --> byte
		byte num6 = (byte)89.987;
		System.out.println(num6); // 89 ���������������ֱ�ӽ�С�������������ֵ������
		//�������㣬byte short char ���Զ�����Ϊ int ����
		byte num01 = 20;
		short num02 = 40;
		char s01 = 'B'; // ��д��ĸ B ת���� int ��������Ϊ 66
		short num03 = (short)(num01 + num02 + s01); // �൱�� int num01 + int num02 + 66 
		System.out.println(num03);
		// float ������
		float num04 = 88.97F; //float �������ͱ���������ֵ���������ĸ F����ȻĬ��Ϊ double ���ͻᱨ��
		float num05 = 76.78F;
		float num06 = num04 * num05;
		System.out.println(num06);
	}
}	