package designpatterns.factorymethod;




/**
 * @author Jason
 * @category 工厂方法模式简单示例
 * 工厂方法模式,要求产品类(HairTV,XiaomiTV)必须实现相同接口(TV)
 * 具体工厂实现工厂接口
 * 具体工厂全限定类名配置在config.xml中,无需修改代码,只需修改配置文件及可修改所需创建的对象,实现解耦
 */
public class Cilent {

	public static void main(String[] args) {
		     
		    TVFactory factory = XMLReaderUtil.getTVFactory();
			TV tv = factory.getBean();
			tv.display();
			  
		
	}

}
