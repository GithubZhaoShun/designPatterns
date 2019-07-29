package designpatterns.factorymethod;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * @author Jason
 * ����xml�ļ��������������󹤾���
 *
 */
public class XMLReaderUtil {
	public static TVFactory getTVFactory() {
		String className = null;
		TVFactory factory = null;
		 try {
				DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = builderFactory.newDocumentBuilder();
				// ���ƶ�λ���ļ��������ĵ�����
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



