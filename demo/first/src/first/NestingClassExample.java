/**  
 * @Title: NestingClassExample.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-12 09:47:39 
 */
package first;

/**  
 * @ClassName: NestingClassExample
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-12 09:47:39 
*/
public class NestingClassExample {

	public static void main(String[] args) {
		// �ڶ�����֮������е����ڲ���
		NestingClassExampleDemo.A1.B1.C1 abc = new NestingClassExampleDemo('*').new A1(" ").new B1(8).new C1();
		abc.getTriangle();
	}

}

//����һ�����Ƕ�׵���
class NestingClassExampleDemo {
	// ����һ����Ա����
	private char start;

	// ���ù��췽��,�����ⲿ����,�����г�ʼ��
	public NestingClassExampleDemo(char start) {
		this.start = start;
	}

	// ����һ���ڲ���A1
	public class A1 {
		// ����һ����Ա����
		private String space;

		// ���ù��췽��,�����ⲿ����,�����г�ʼ��
		public A1(String space) {
			this.space = space;
		}

		// ����һ���ڲ���B1
		public class B1 {
			// ����һ����Ա����
			private int num;

			// ���ù��췽��,�����ⲿ����,�����г�ʼ��
			public B1(int num) {
				this.num = num;
			}

			// ����һ���ڲ��� C1
			public class C1 {
				// ����һ����Ա����,�����ⲿ��ĳ�Ա����
				public void getTriangle() {
					// ��ӡ������
					// ����ѭ������
					for (int i = 0; i < num; i++) {
						// ���ƴ�ӡ�Ŀո�
						for (int j = num - 1; j > i; j--) {
							System.out.print(space);
						}
						// ���ƴ�ӡ���ַ�
						for (int k = 0; k < (2 * i) - 1; k++) {
							System.out.print(start);
						}
						// ѭ��һ�ξͻ���
						System.out.println();
					}

				}
			}
		}
	}
}
