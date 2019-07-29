package designpatterns.factorymethod;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * @author Jason
 * 解析xml文件并创建工厂对象工具类
 *
 */
public class XMLReaderUtil {
	public static TVFactory getTVFactory() {
		String className = null;
		TVFactory factory = null;
		 try {
				DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = builderFactory.newDocumentBuilder();
				// 将制定位置文件解析成文档对象
				Document document = builder.parse(new File("src/designpatterns/factorymethod/config.xml"));
				NodeList nodeList = document.getElementsByTagName("className");

				Node node = nodeList.item(0).getFirstChild();
				 className = node.getNodeValue();
				 factory = (TVFactory) Class.forName(className).newInstance();
				 
			
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return factory; 
		}
	
	}



