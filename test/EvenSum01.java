public class EvenSum01 
{
	public static void main(String[] args) 
	{
		//求 0-100 之间偶数之和,方案一
		int sum1 = 0; //初始化接收容器
		for (int i = 0; i <= 100; i+=2) {
			sum1 += i;
		}
		System.out.println(sum1);
		System.out.println("-----------分割线------------");
		//求 0-100 之间偶数之和,方案二
		int i = 0;
		int sum2 = 0;
		while (i <= 100) {
			sum2 += i;
			i += 2;
		}
		System.out.println(sum2);
		System.out.println("-----------分割线------------");
		//求 1-100 之间偶数之和,方案三
		int sum3 = 0;
		int j = 0;
		do {
			sum3 += j;
			j += 2;
		} while(j <= 100);
		System.out.println(sum3);
		System.out.println("-----------分割线------------");
		//求 1-100 之间偶数之和,方案四
		int sum4 = 0;
		for (int k = 1; k <= 100; k++)
		{
			if (k % 2 == 0)
			{
				sum4 += k;
			} else {
				continue; //continue 是指 当下的这个结果不要了，继续下一次循环
			}
		}
		System.out.println(sum4);
	}
}
