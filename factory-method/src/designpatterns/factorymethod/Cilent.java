package designpatterns.factorymethod;




/**
 * @author Jason
 * @category ��������ģʽ��ʾ��
 * ��������ģʽ,Ҫ���Ʒ��(HairTV,XiaomiTV)����ʵ����ͬ�ӿ�(TV)
 * ���幤��ʵ�ֹ����ӿ�
 * ���幤��ȫ�޶�����������config.xml��,�����޸Ĵ���,ֻ���޸������ļ������޸����贴���Ķ���,ʵ�ֽ���
 */
public class Cilent {

	public static void main(String[] args) {
		     
		    TVFactory factory = XMLReaderUtil.getTVFactory();
			TV tv = factory.getBean();
			tv.display();
			  
		
	}

}
