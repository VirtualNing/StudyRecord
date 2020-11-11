public class InstanceCounter {
	private static int numInstances = 0; //˽�еľ�̬ int ���ͱ���
	protected static int getCount() { //�ܱ����ľ�̬ int ������������,�����ص���������һ���� int
		return numInstances; //������ֱ�ӷ���
	}
	
	private static void addInstance() { //void ��˼���޷���ֵ
		numInstances++; //�������ÿ����һ�ξ���ԭ�����ϼ� 1
	}

	InstanceCounter() { //�������Ĭ���� public
		InstanceCounter.addInstance();//ͨ�� ����.������ ��������������
	}

	public static void main(String[] agrs) { //args �� argsguments ��д����������
		System.out.println("��ʼֵ" + InstanceCounter.getCount());
		for(int i = 0; i < 600; i++) { //ѭ��600��
			new InstanceCounter();//���� InstanceCounter() ������ʵ����ÿ����һ��ʵ��������������ı�
		}//����������һ��ѭ���Ľ��
		System.out.println("ѭ�����ֵ" + InstanceCounter.getCount()); //600
	}
}