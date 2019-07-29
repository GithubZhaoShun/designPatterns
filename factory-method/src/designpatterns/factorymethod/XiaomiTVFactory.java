package designpatterns.factorymethod;

public class XiaomiTVFactory implements TVFactory {

	@Override
	public TV getBean() {
		// TODO Auto-generated method stub
		return new XiaomiTV();
	}



}
