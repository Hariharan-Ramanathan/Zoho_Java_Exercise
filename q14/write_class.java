package q14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class write_class {
   public static void main(String[] args) throws IOException {
    
    FileOutputStream fos = null;

   try{
        File file = new File("xmldoc.xml");
        DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbfactory.newDocumentBuilder();
    
        StringBuilder sb = new StringBuilder();
        sb.append(
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><class></class>"
        );
        fos = new FileOutputStream(file);
        fos.write(sb.toString().getBytes());
    
        Document doc = db.parse(file);
    
        
    
        Node root_node = doc.getDocumentElement();
    
        Element root_ele = doc.createElement("student");
        root_node.appendChild(root_ele);
        root_ele.setAttribute("rollno", "301");
    
        Element f_n = doc.createElement("firstname");
        f_n.appendChild(doc.createTextNode("Hari"));
        root_ele.appendChild(f_n);
    
        Element l_n = doc.createElement("lastname");
        l_n.appendChild(doc.createTextNode("haran"));
        root_ele.appendChild(l_n);
    
        Element n_n = doc.createElement("nickname");
        n_n.appendChild(doc.createTextNode("HR"));
        root_ele.appendChild(n_n);
    
        Element marks = doc.createElement("marks");
        marks.appendChild(doc.createTextNode("100"));
        root_ele.appendChild(marks);
    
        
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = tf.newTransformer();
        
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(file);
    
        t.transform(source, result);
    
    }
    catch(FileNotFoundException e){
        System.out.println(e);
    }

    catch(SAXException e){
        System.out.println(e);
    }
    catch(ParserConfigurationException e){
        System.out.println(e);
    }
    catch(TransformerException e){
        System.out.println(e);
   }
   catch(Exception e){
        System.out.println(e);
   }
   finally{
        fos.close();
    }
    }
}