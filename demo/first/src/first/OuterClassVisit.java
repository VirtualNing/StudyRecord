/**  
 * @Title: OuterClassVisit.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-13 02:30:25 
 */
package first;

/**  
 * @ClassName: OuterClassVisit
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-13 02:30:25 
*/
public class OuterClassVisit {

	public static void main(String[] args) {
		// �ⲿ��֮���������ڲ���

		// ���ʾ�̬�ڲ���ľ�̬��Ա
		// ͨ������ֱ�ӵ��þ�̬��Ա,���¸���Ĺ��췽��δ����
		// ���췽���еķ�����δִ��,�Ͳ����ڸ�ֵ����
		System.out.println(OuterClassVisitDemo.A1.num); // 0

		// ���ʾ�̬�ڲ����ʵ����Ա
		OuterClassVisitDemo.A1 a1 = new OuterClassVisitDemo.A1();
		System.out.println(a1.str1);

	}

}

//����һ��Ƕ����
class OuterClassVisitDemo {
	// ����һ����̬����
	private static int num = 10;
	// ����һ��ʵ������
	private String str1;

	// ��������췽�����ղ���
	public OuterClassVisitDemo(String str1) {
		this.str1 = str1;
	}

	// ����һ����̬�ڲ���
	protected static class A1 {
		// ����������Ա����
		static int num;
		protected String str1;

		public String toString() {
			return "���Ǿ�̬�ڲ���";
		}

		// ��һ�����췽��,����Ա���Ը�ֵ
		public A1() {
			// ͨ���ⲿ�������ʾ�̬��Ա����ֵ
			num = OuterClassVisitDemo.num;
			// ͨ���ⲿ��ʵ������ʵ����Ա����ֵ
			this.str1 = new OuterClassVisitDemo("�����ڲ���").str1;
		}

	}
}
