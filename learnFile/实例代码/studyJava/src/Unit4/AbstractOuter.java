package Unit4;

/**
 * �����ڲ���
 * 
 * @author JHZ
 *
 */
abstract class AbstractOuter {// �����ⲿ��
	public abstract void printOuter();

	abstract class AbstractInner {// �����ڲ���
		public abstract void printInner();
	}

	class Inner {// ��ͨ�ڲ���
		public void print() {
			System.out.println("Hello World!");
		}
	}

}

/**
 * �̳��ⲿ������
 * 
 * @author JHZ
 *
 */
class OuterImpl extends AbstractOuter {

	@Override
	public void printOuter() {
		new Inner().print(); // ʵ�����ڲ���Ķ�����÷���

	}

}
