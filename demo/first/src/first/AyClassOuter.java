/**  
 * @Title: AyClassOuter.java
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-14 08:04:43 
 */
package first;

/**  
 * @ClassName: AyClassOuter
 * @Description: TODO(����)
 * @author author
 * @date 2020-10-14 08:04:43 
*/
public class AyClassOuter {

	public static void main(String[] args) {
		AyClassSonShow ac1 = new AyClassSonShow();
		ac1.arrayHeavy();

	}

}

//����һ����,����ķ���������ʵ��
class AyClassPerson {
	// ����һ������,�÷������ڲ���Ԫ���±�
	public int getArrayIndex(String[] str, String key) {
		return -1;
	}
}

//����һ����,�ڸ�������Ҫʵ�ָ����������̳�,�ӿڵ�������̳�
class AyClassSonShow {
	// ����һ�������ַ�������
	private String[] strArray = new String[] { "1", "6", "1", "9", "6", "8", "9", "8" };

	// ���ڲ���

	// ��ʵ�ֽӿ�������
	AyClassInterface aCi1 = new AyClassInterface() {
		// ��д�ӿڵķ���,ʵ����������
		public String[] getArraySort(String[] str) {
			// ��Ҫ�����ַ�������ת�����������,Integer.parseInt();
			// ���������ת���ַ������� toString();
			int[] myArray = new int[str.length];
			int len = str.length;
			for (int i = 0; i < len; i++) {
				myArray[i] = Integer.parseInt(str[i]);
			}
			// ϣ������
			int temp, gap = len / 2; // gap ��ָ��ǰ���鳤�ȵ�һ��
			// gap > 0 ��ָ���黹���Է������
			while (gap > 0) {

				for (int j = gap; j < len; j++) {
					temp = myArray[j]; // �����鿿���м�λ�õ�Ԫ�ظ�ֵ��temp
					int perIndex = j - gap; // ��¼��ʼλ��

					while (perIndex >= 0 && myArray[perIndex] > temp) {
						// ����ʼλ�ô��ڵ���0�ҳ�ʼλ��Ԫ�� ���� �����м�λ�õ�Ԫ��
						myArray[perIndex + gap] = myArray[perIndex]; // ����ʼλ�õ�Ԫ���滻���м�λ��
						perIndex -= gap; // ������ǰ while ѭ��
					}
					// ���м�λ��Ԫ���滻����ʼλ��
					myArray[perIndex + gap] = temp;
				}
				// �ٴη���
				gap /= 2;
			}

			// �ٴ�ת��Ϊ�ַ�������
			String[] myStr = new String[len];
			for (int k = 0; k < len; k++) {
				myStr[k] = myArray[k] + "";
			}

			return myStr;
		}
	};

	// ��ʵ�ָ����������̳�,д�ڷ�����
	public int getPersonIndex(String[] str, String key) {
		// ʵ����������ڲ���̳�
		AyClassPerson aCp1 = new AyClassPerson() {
			// ��д����ķ���
			/*
			 * public int getArrayIndex(String[] str, String key) { } ûд���
			 */
		};
		int result = aCp1.getArrayIndex(str, key);
		return result;
	}

	// ʵ������ȥ��
	public void arrayHeavy() {
		// ����
		String[] myStrings = aCi1.getArraySort(strArray);
		// �ٴ���һ��������
		StringBuilder sbString = new StringBuilder();
		for (int i = 0; i < myStrings.length; i++) {
			if (sbString.lastIndexOf(myStrings[i]) == -1) {
				sbString.append(myStrings[i] + ", ");
			}
		}

		System.out.println(sbString.substring(0));
	}

}
