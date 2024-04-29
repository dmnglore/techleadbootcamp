package com.craft.owasp;

	import javax.xml.parsers.DocumentBuilderFactory;
	import javax.xml.parsers.ParserConfigurationException;
	import javax.xml.parsers.SAXParserFactory;
	import org.xml.sax.SAXException;
	import org.xml.sax.helpers.DefaultHandler;

	public class XMLParserDemo {

	    public static void main(String[] args) {
	        // Vulnerable XML input
	        String xmlInput = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
	                + "<!DOCTYPE data [\n"
	                + "  <!ENTITY xxe SYSTEM \"file:///etc/passwd\">\n"
	                + "]>\n"
	                + "<data>&xxe;</data>";

	        // Attempt to parse the XML input with a vulnerable parser
	        try {
	            // Vulnerable DOM parser
	            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	            dbf.setExpandEntityReferences(false); // Disable external entities
	            dbf.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
	            dbf.setFeature("http://xml.org/sax/features/external-general-entities", false);
	            dbf.setFeature("http://xml.org/sax/features/external-parameter-entities", false);

	            // Attempt to parse the XML input
	            dbf.newDocumentBuilder().parse(new org.xml.sax.InputSource(new java.io.StringReader(xmlInput)));

	            System.out.println("XML parsing successful. No XXE vulnerability detected.");
	        } catch (ParserConfigurationException | SAXException | java.io.IOException e) {
	            System.out.println("XML parsing failed. Possible XXE vulnerability detected.");
	            e.printStackTrace();
	        }

	        try {
	            // Vulnerable SAX parser
	            SAXParserFactory spf = SAXParserFactory.newInstance();
	            spf.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
	            spf.setFeature("http://xml.org/sax/features/external-general-entities", false);
	            spf.setFeature("http://xml.org/sax/features/external-parameter-entities", false);

	            // Attempt to parse the XML input
	            spf.newSAXParser().parse(new org.xml.sax.InputSource(new java.io.StringReader(xmlInput)), new DefaultHandler());

	            System.out.println("XML parsing successful. No XXE vulnerability detected.");
	        } catch (ParserConfigurationException | SAXException | java.io.IOException e) {
	            System.out.println("XML parsing failed. Possible XXE vulnerability detected.");
	            e.printStackTrace();
	        }
	    }
	}
