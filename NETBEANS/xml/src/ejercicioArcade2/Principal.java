/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioArcade2;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        DocumentBuilder builder=factory.newDocumentBuilder();
        
        Document document=builder.parse("C:\\Users\\FP\\Documents\\NetBeansProjects\\xml\\taburete.xml");
        document.getDocumentElement().normalize();
        
        
        NodeList nList=document.getElementsByTagName("tabure");
        
        for (int i = 0; i < nList.getLength(); i++) {
            Node node=nList.item(0);
            
            if(node.getNodeType()==Node.ENTITY_NODE){
                
            }
        }
    }
   
}
