public class EvenSum01 
{
	public static void main(String[] args) 
	{
		//�� 0-100 ֮��ż��֮��,����һ
		int sum1 = 0; //��ʼ����������
		for (int i = 0; i <= 100; i+=2) {
			sum1 += i;
		}
		System.out.println(sum1);
		System.out.println("-----------�ָ���------------");
		//�� 0-100 ֮��ż��֮��,������
		int i = 0;
		int sum2 = 0;
		while (i <= 100) {
			sum2 += i;
			i += 2;
		}
		System.out.println(sum2);
		System.out.println("-----------�ָ���------------");
		//�� 1-100 ֮��ż��֮��,������
		int sum3 = 0;
		int j = 0;
		do {
			sum3 += j;
			j += 2;
		} while(j <= 100);
		System.out.println(sum3);
		System.out.println("-----------�ָ���------------");
		//�� 1-100 ֮��ż��֮��,������
		int sum4 = 0;
		for (int k = 1; k <= 100; k++)
		{
			if (k % 2 == 0)
			{
				sum4 += k;
			} else {
				continue; //continue ��ָ ���µ���������Ҫ�ˣ�������һ��ѭ��
			}
		}
		System.out.println(sum4);
	}
}
