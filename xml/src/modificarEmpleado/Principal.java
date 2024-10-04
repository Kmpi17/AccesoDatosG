/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modificarEmpleado;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
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
    public static void main(String[] args) throws ParserConfigurationException, TransformerConfigurationException, TransformerException, FileNotFoundException, SAXException, IOException {
    
        
    ArrayList<Empleado> empleados=new ArrayList<>();
        
    DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
    DocumentBuilder builder =factory.newDocumentBuilder();
    Document doc=builder.parse("C:\\Users\\FP\\Documents\\NetBeansProjects\\Interfazes\\xml\\empleados.xml");
    doc.getDocumentElement().normalize();
    
    NodeList nList=doc.getElementsByTagName("empleado");
    
        for (int i = 0; i < nList.getLength(); i++) {
            Node node=nList.item(i);
            
            if (node.getNodeType()==Node.ELEMENT_NODE) {
                
                Element eElement=(Element) node;
                
                String id=eElement.getAttribute("id");
                String nombre=eElement.getElementsByTagName("nombre").item(0).getTextContent();
                String apellido=eElement.getElementsByTagName("apellido").item(0).getTextContent();
                String ciudad=eElement.getElementsByTagName("ciudad").item(0).getTextContent();
                        
                empleados.add(new Empleado(id,nombre,apellido,ciudad));
                
            }
        }
    
    
        
        for(Empleado e:empleados){
            System.out.println(empleados.toString());
        }
      
        
   Empleado empleadoNuevo=new Empleado("","","","");
   empleados.add(empleadoNuevo);
   DocumentBuilderFactory dFactory=DocumentBuilderFactory.newDefaultInstance();
   DocumentBuilder dBuilder=dFactory.newDocumentBuilder();
   Document document=dBuilder.newDocument();
   
   Element root=document.createElement("empleados");
   doc.appendChild(root);
   
   for(Empleado e1:empleados){
 
    
   Element moduloEmpleado=document.createElement("empleado");
   moduloEmpleado.setAttribute("id",e1.getId());
   root.appendChild(moduloEmpleado);
   
   Element moduloNombre=document.createElement("nombre");
   moduloNombre.appendChild(document.createTextNode(e1.getNombre()));
   moduloEmpleado.appendChild(moduloNombre);
   
   Element moduloApellido=document.createElement("apellido");
   moduloApellido.appendChild(document.createTextNode(e1.getApellido()));
   moduloEmpleado.appendChild(moduloApellido);
   
   Element moduloCiudad=document.createElement("ciudad");
   moduloCiudad.appendChild(document.createTextNode(e1.getCiudad()));
   moduloEmpleado.appendChild(moduloCiudad);
   
      
   }
    
    
    
    TransformerFactory transformerFactory=TransformerFactory.newInstance();
    Transformer transformer=transformerFactory.newTransformer();
    DOMSource source=new DOMSource(doc);
    StreamResult result=new StreamResult(new FileOutputStream("empleados3"+".xml"));
    transformer.transform(source, result);
        System.out.println("Datos actualizados");
    }
    
}
