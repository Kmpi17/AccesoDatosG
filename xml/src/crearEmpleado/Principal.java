/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crearEmpleado;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws ParserConfigurationException, TransformerConfigurationException, TransformerException, FileNotFoundException {
        
    DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
    DocumentBuilder builder =factory.newDocumentBuilder();
    Document doc=builder.newDocument();
    
    
    Element root=doc.createElement("empleados");
    doc.appendChild(root);
    
    Element moduloEmpleado=doc.createElement("empleado");
    moduloEmpleado.setAttribute("id", "111");
    root.appendChild(moduloEmpleado);
    
    Element moduloNombre=doc.createElement("nombre");
    moduloNombre.appendChild(doc.createTextNode("Jeff Bezos"));
    moduloEmpleado.appendChild(moduloNombre);
    
       Element moduloCiudad=doc.createElement("ciudad");
    moduloCiudad.appendChild(doc.createTextNode("Florida"));
    moduloEmpleado.appendChild(moduloCiudad);
    
    
        TransformerFactory transformerFactory=TransformerFactory.newInstance();
    Transformer transformer=transformerFactory.newTransformer();
    DOMSource source=new DOMSource(doc);
    StreamResult result=new StreamResult(new FileOutputStream("empleados2"+".xml"));
    transformer.transform(source, result);
        System.out.println("Datos actualizados");
    
    }
    
}
