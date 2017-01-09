package amaysim.exam;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import amaysim.pojo.Bulk_discount;
import amaysim.pojo.Bundle;
import amaysim.pojo.Pricing_rules;
import amaysim.pojo.Promo;
import amaysim.pojo.Three_for_two;

public final class Pricing_rules_Util {

	private Pricing_rules_Util() {

	}

	public static Pricing_rules load_pricing_rules() {
		
		Pricing_rules pricing_rules = new Pricing_rules();
		
		try {

			File fXmlFile = new File("src/resources/pricing_rules.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
			
			NodeList three_for_two_node_list = doc.getElementsByTagName("three_for_two");

			for (int i = 0; i < three_for_two_node_list.getLength(); i++) {
				Node nNode = three_for_two_node_list.item(i);
				Element three_for_two_node_elements = (Element) nNode;
				Three_for_two tft = new Three_for_two();
				tft.setBuy_amount(three_for_two_node_elements.getElementsByTagName("buy_amount").item(0).getTextContent());
				tft.setPay_amount(three_for_two_node_elements.getElementsByTagName("pay_amount").item(0).getTextContent());
				tft.setProduct_code(three_for_two_node_elements.getElementsByTagName("product_code").item(0).getTextContent());
				pricing_rules.setThree_for_two(tft);
			}
			
			
			NodeList bulk_discount_node_list = doc.getElementsByTagName("bulk_discount");
			
			for (int i = 0; i < bulk_discount_node_list.getLength(); i++) {
				Node nNode = bulk_discount_node_list.item(i);
				Element bulk_discount_node_elements = (Element) nNode;
				Bulk_discount bd = new Bulk_discount();
				bd.setBuy_amount(bulk_discount_node_elements.getElementsByTagName("buy_amount").item(0).getTextContent());
				bd.setPrice_after_discount(bulk_discount_node_elements.getElementsByTagName("price_after_discount").item(0).getTextContent());
				bd.setProduct_code(bulk_discount_node_elements.getElementsByTagName("product_code").item(0).getTextContent());
				pricing_rules.setBulk_discount(bd);
			}
			
			NodeList bundle_node_list = doc.getElementsByTagName("bundle");
			
			for (int i = 0; i < bundle_node_list.getLength(); i++) {
				Node nNode = bundle_node_list.item(i);
				Element bundle_node_elements = (Element) nNode;
				Bundle bundle = new Bundle();
				bundle.setBundled_amount(bundle_node_elements.getElementsByTagName("bundled_amount").item(0).getTextContent());
				bundle.setBuy_amount(bundle_node_elements.getElementsByTagName("buy_amount").item(0).getTextContent());
				bundle.setProduct_code_for_bundle(bundle_node_elements.getElementsByTagName("product_code_for_bundle").item(0).getTextContent());
				bundle.setProduct_code(bundle_node_elements.getElementsByTagName("product_code").item(0).getTextContent());
				pricing_rules.setBundle(bundle);
			}
			
			NodeList promo_node_list = doc.getElementsByTagName("promo");
			
			for (int i = 0; i < promo_node_list.getLength(); i++) {
				Node nNode = promo_node_list.item(i);
				Element promo_node_elements = (Element) nNode;
				Promo promo = new Promo();
				promo.setDiscount(promo_node_elements.getElementsByTagName("discount").item(0).getTextContent());
				promo.setPromo_code(promo_node_elements.getElementsByTagName("promo_code").item(0).getTextContent());
				pricing_rules.setPromo(promo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return pricing_rules;
	}

}
