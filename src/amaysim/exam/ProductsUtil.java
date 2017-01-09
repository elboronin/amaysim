package amaysim.exam;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import amaysim.pojo.One_gb;
import amaysim.pojo.Products;
import amaysim.pojo.Ult_large;
import amaysim.pojo.Ult_medium;
import amaysim.pojo.Ult_small;

public class ProductsUtil {

	private ProductsUtil() {

	}

	public static Products load_Products() {
		
		Products prod = new Products();
		
		try {

			File fXmlFile = new File("src/resources/products.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
			
			NodeList ult_small_node_list = doc.getElementsByTagName("ult_small");

			for (int i = 0; i < ult_small_node_list.getLength(); i++) {
				Node nNode = ult_small_node_list.item(i);
				Element ult_small_node_elements = (Element) nNode;
				Ult_small ult_small = new Ult_small();
				ult_small.setName(ult_small_node_elements.getElementsByTagName("name").item(0).getTextContent());
				ult_small.setUnit_price(ult_small_node_elements.getElementsByTagName("unit_price").item(0).getTextContent());
				prod.setUlt_small(ult_small);
			}

			NodeList ult_medium_node_list = doc.getElementsByTagName("ult_medium");
			
			for (int i = 0; i < ult_medium_node_list.getLength(); i++) {
				Node nNode = ult_medium_node_list.item(i);
				Element ult_medium_node_elements = (Element) nNode;
				Ult_medium ult_medium = new Ult_medium();
				ult_medium.setName(ult_medium_node_elements.getElementsByTagName("name").item(0).getTextContent());
				ult_medium.setUnit_price(ult_medium_node_elements.getElementsByTagName("unit_price").item(0).getTextContent());
				prod.setUlt_medium(ult_medium);
			}
			
			NodeList ult_large_node_list = doc.getElementsByTagName("ult_large");
			
			for (int i = 0; i < ult_large_node_list.getLength(); i++) {
				Node nNode = ult_large_node_list.item(i);
				Element ult_large_node_elements = (Element) nNode;
				Ult_large ult_large = new Ult_large();
				ult_large.setName(ult_large_node_elements.getElementsByTagName("name").item(0).getTextContent());
				ult_large.setUnit_price(ult_large_node_elements.getElementsByTagName("unit_price").item(0).getTextContent());
				prod.setUlt_large(ult_large);
			}
			
			NodeList one_gb_node_list = doc.getElementsByTagName("one_gb");
			
			for (int i = 0; i < one_gb_node_list.getLength(); i++) {
				Node nNode = one_gb_node_list.item(i);
				Element one_gb_node_elements = (Element) nNode;
				One_gb one_gb = new One_gb();
				one_gb.setName(one_gb_node_elements.getElementsByTagName("name").item(0).getTextContent());
				one_gb.setUnit_price(one_gb_node_elements.getElementsByTagName("unit_price").item(0).getTextContent());
				prod.setOne_gb(one_gb);
			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return prod;
		
	}
}
