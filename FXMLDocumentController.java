/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas3;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author andre
 */
public class FXMLDocumentController implements Initializable {

    Conexion con = new Conexion();
    Persona alumno = new Persona();
    ArrayList<Persona> list = new ArrayList<>();

    @FXML
    private TableColumn idAlumno;

    @FXML
    private TableColumn estado;

    @FXML
    private TableColumn ciudad;

    @FXML
    private TableColumn nombreAlumno;

    @FXML
    private Label label;

    @FXML
    private TableColumn nombreUsuario;

    @FXML
    private TableView<Persona> miTabla;

    private ObservableList<Persona> personas;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.nombreAlumno.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.ciudad.setCellValueFactory(new PropertyValueFactory("ciudad"));
        this.estado.setCellValueFactory(new PropertyValueFactory("estado"));
        this.idAlumno.setCellValueFactory(new PropertyValueFactory("idAlumno"));
        this.nombreUsuario.setCellValueFactory(new PropertyValueFactory("nombreUsuario"));
    }

    public void verDatos() {
        con.cLocal2();
        System.out.println("Estado:" + con.status());

        personas = FXCollections.observableArrayList();
        list = con.verDatosAlumno();

        for (Persona persona : list) {
            System.out.println("+");
            personas.add(persona);
        }
        this.miTabla.setItems(personas);

    }

}
