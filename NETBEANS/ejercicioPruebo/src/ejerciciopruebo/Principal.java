/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopruebo;

import java.io.FileWriter;
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
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
       
        
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        DocumentBuilder builder=factory.newDocumentBuilder();
        
        Document document=builder.parse("C:\\Users\\FP\\Documents\\NetBeansProjects\\ejercicioPruebo\\Categoriacamarasweb.xml");
        document.getDocumentElement().normalize();
        
        NodeList nList=document.getElementsByTagName("camara");
        
        
        FileWriter escritura=new FileWriter("C:\\Users\\FP\\Documents\\NetBeansProjects\\ejercicioPruebo\\camarashecho.txt");
        int contador=0;
        int contadorL;
        
        
        
      
        for (int i = 0; i <nList.getLength(); i++) {
            Node node=nList.item(i);
           
            
            contadorL=nList.getLength();
             contador++;
            if (node.getNodeType()==Node.ELEMENT_NODE) {
                Element eElement=(Element) node;
                
                if (contador==1) {
                   
                    escritura.write("Lo ultimo de las camaras web"+"\n");
                    
                    escritura.write("\n");
                    escritura.write("==================="+"\n");
                    escritura.write("\n");
                }
                
                escritura.write("Model¡¡"+eElement.getElementsByTagName("modelo").item(0).getTextContent()+"\n");
                escritura.write("\n");
                
                escritura.write("Marca¡¡"+eElement.getElementsByTagName("marca").item(0).getTextContent()+"\n");
                escritura.write("\n");
                escritura.write("Dimensiones altura#"+eElement.getElementsByTagName("altura").item(0).getTextContent()+"\n");
                escritura.write("\n");
                escritura.write("Dimensiones anchura@"+eElement.getElementsByTagName("anchura").item(0).getTextContent()+"\n");
                escritura.write("\n");
                escritura.write("Dimensiones profundiad#"+eElement.getElementsByTagName("profundidad").item(0).getTextContent()+"\n");
                escritura.write("\n");
                escritura.write("Dimensiones peso@"+eElement.getElementsByTagName("peso").item(0).getTextContent()+"\n");
                escritura.write("\n");
                escritura.write("Resolucion Megapixeles#"+eElement.getElementsByTagName("megapixeles").item(0).getTextContent()+"\n");
                escritura.write("\n");
                escritura.write("Comentarios "+eElement.getElementsByTagName("comentarios").item(0).getTextContent()+"\n");
                escritura.write("\n");
                escritura.write("*********************"+"\n");
                escritura.write("\n");
                
                if(contador==contadorL){
                    
                    escritura.write("---"+"\n");
                    escritura.write("\n");
                    escritura.write("++++++++++++"+"\n");
                    escritura.write("\n");
                    escritura.write("Fin del documento XML");
                }else{
                  
                }
            }
            
        }
        escritura.close();
    }
}
