package designpatterns.factorymethod;

public class HairTVFactory implements TVFactory {

	@Override
	public TV getBean() {
		// TODO Auto-generated method stub
		return new HairTV();
	}

}
