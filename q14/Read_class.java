//XML Document Creating and Parsing
//  Learn about different types of parsers and difference between them.
//  Create a XML document, insert multiple nodes of your choice and save it in a XML file.
//  Parse the above created XML file and print the nodes and their values.
//  Tips:
//      Go through Element, DocumentBuilder, Document for XML related apis in java
//      Go through the example here to parse a XML file using these apis


package q14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Read_class{
    public static void main(String[] args) {
        try{
            File file = new File("xmldoc.xml");
            DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbfactory.newDocumentBuilder();
            Document doc = db.parse(file);      

            doc.getDocumentElement().normalize();

            System.out.println("Root node - "+ doc.getDocumentElement().getNodeName());

            NodeList list = doc.getElementsByTagName("student");

            System.out.println("-----------------------");

            for(int i=0;i<list.getLength();i++){
                Node n = list.item(i);
                if(n.getNodeType() == Node.ELEMENT_NODE){
                    Element ele = (Element)n;
                    System.out.println("node name - "+ n.getNodeName());
                    System.out.println("roll num - "+ ele.getAttribute("rollno"));
                    System.out.println("first name - "+ ele.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("last name - "+ ele.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("nick name - "+ ele.getElementsByTagName("nickname").item(0).getTextContent());
                    System.out.println("Mark - "+ele.getElementsByTagName("marks").item(0).getTextContent());
                    
            
            System.out.println("-----------------------");
            }
        }
        
    }
    catch(FileNotFoundException e ){
        System.out.println(e);
    }
    catch(IOException e){
        System.out.println(e);
    }
    catch(SAXException e){
        System.out.println(e);
    }
    catch(ParserConfigurationException e){
            System.out.println(e);
    }
    catch(Exception e){
        System.out.println(e);
    }
    finally{
        System.out.println("Program unexpectedly terminated");
    }
}
}