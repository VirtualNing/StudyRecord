/**  
 * @Title: ExampleNestClass.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-12 05:12:28 
 */
package first;

/**  
 * @ClassName: ExampleNestClass
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-12 05:12:28 
*/
public class ExampleNestClass {
	public static void main(String[] args) {
		// �ⲿ��֮���������ڲ���,����һ
		// ͨ������ֱ�ӷ��ʸ���ľ�̬��Ա����
		// �þ�̬��Ա�������Ѵ������
		ExampleNestClassShow.getMethod();

		// �ⲿ��֮���������ڲ���,������
		ExampleNestClassShow.EnCs1 eNcSeCs1 = new ExampleNestClassShow().new EnCs1();
		eNcSeCs1.getNum();
		eNcSeCs1.getStr();
		eNcSeCs1.getRandom();
	}
}

//����һ��Ƕ����
class ExampleNestClassShow {
	// ����һ���ڲ���
	public class EnCs1 {
		// ����һ�����е� ���յ� ��̬��Ա����
		public static final int num = 10;

		// str1 ������ʼ��
		public EnCs1() {
			// this.str1 = str1;
		}

		// ����һ����Ա����
		public void getNum() {
			// ֱ��ʹ���ⲿ��ľ�̬��Ա
			System.out.println(num + sum);
		}

		public void getStr() {
			// ֱ��ʹ���ⲿ��ķǾ�̬��Ա
			System.out.println(string);
		}

		public void getRandom() {
			// �����ⲿ��ĳ�Ա����
			System.out.println(getRandoms());
		}
	}

	// ����һ����̬��Ա����
	private static int sum = 20;

	// ����һ����Ա����
	private String string;

	public ExampleNestClassShow() {
		this.string = "����";
	}

	// ����һ����Ա����
	private double getRandoms() {
		return Math.random() * sum;
	}

	// ����һ����̬��Ա����,�����ڲ����еĳ�Ա
	public static void getMethod() {
		// �ڲ���֮��,�ⲿ��֮��̬�����е����ڲ���
		ExampleNestClassShow.EnCs1 ec1 = new ExampleNestClassShow().new EnCs1();
		ec1.getNum();
		ec1.getStr();
		ec1.getRandom();
	}
}
