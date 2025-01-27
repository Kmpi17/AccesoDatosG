/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioArcade;

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
        
       DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
       DocumentBuilder builder=factory.newDocumentBuilder();
       
       Document document=builder.parse("C:\\Users\\FP\\Documents\\NetBeansProjects\\xml\\taburete.xml");
       document.getDocumentElement().normalize();
       
       NodeList nList=document.getElementsByTagName("tabure");
        
        
        int contador=0;
        int contadorL=0;
        for (int i = 0; i < nList.getLength(); i++) {
            Node node=nList.item(i);
            contadorL=nList.getLength();
            contador++;
            System.out.println("");
            if(node.getNodeType()==Node.ELEMENT_NODE){
                Element eElement=(Element) node;
                if(contador==1){
                    System.out.println("-.-(Empiezan los registros)");
                }
                System.out.println("==================");
                System.out.println("Registro"+contador);
                System.out.println("");
                System.out.println("Id silla :"+eElement.getAttribute("id"));
                System.out.println("Diseño : "+eElement.getElementsByTagName("diseño").item(0).getTextContent());
                System.out.println("Material de la Base y Pie : "+eElement.getElementsByTagName("basepie").item(0).getTextContent());
                System.out.println("Reposapies : "+eElement.getElementsByTagName("reposapies").item(0).getTextContent());
                System.out.println("Proteccion : "+eElement.getElementsByTagName("proteccion").item(0).getTextContent());
                System.out.println("Calidad : "+eElement.getElementsByTagName("calidad").item(0).getTextContent());
                System.out.println("Asiento: "+eElement.getElementsByTagName("asiento").item(0).getTextContent());
                System.out.println("Altura : "+eElement.getElementsByTagName("altura").item(0).getTextContent());
                System.out.println("Tamaño del asiento :"+eElement.getElementsByTagName("asientoT").item(0).getTextContent());
                System.out.println("Tamaño de la base :"+eElement.getElementsByTagName("baseT").item(0).getTextContent());
                
                if(contador==contadorL){
                    System.out.println(";;;;");
                }
                
                if(contador!=contadorL){
                    System.out.println(";;");
                }

            }
        }
    }
}
