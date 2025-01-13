/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Vista;

import Modelo.Personaje;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author FP
 */
public class VentanaController implements Initializable {

    @FXML
    private TextField nombre;
    @FXML
    private TextField nivel;
    @FXML
    private TextField genero;
    @FXML
    private TextField claseIncial;

    private ArrayList<Personaje> usuarios = new ArrayList<>();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML

    public void crearPersonaje() {

        String nombreUsuario = nombre.getText();
        int nivelUsuario = Integer.parseInt(nivel.getText());
        String generoUsuario = genero.getText();
        String claseInicialUsuario = claseIncial.getText();

        if (nombreUsuario.isEmpty() || generoUsuario.isEmpty() || claseInicialUsuario.isEmpty() || nivel.getText().isEmpty()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Campos vacíos");
            alert.setContentText("Por favor, complete todos los campos.");
            alert.showAndWait();
        } else {

            Personaje personaje = new Personaje(nivelUsuario, nombreUsuario, generoUsuario, claseInicialUsuario); // valores de ejemplo

            usuarios.add(personaje);

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Usuario Creado");
            alert.setHeaderText("Usuario Creado Exitosamente");
            alert.setContentText("El usuario ha sido insertado.");
            alert.showAndWait();

            nombre.clear();
            nivel.clear();
            genero.clear();
            claseIncial.clear();
        }
    }
}
