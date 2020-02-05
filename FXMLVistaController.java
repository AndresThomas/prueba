package basedatos;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Thomas
 */
public class FXMLVistaController implements Initializable {

    conexion conn = new conexion();
    @FXML
    TableView<Persona> miTabla = new TableView<>();
    ObservableList<Persona> datos;
    @FXML
    TableColumn idAlumno;
    @FXML
    TableColumn nombreAlumno;
    @FXML
    TableColumn ciudad;
    @FXML
    TableColumn estado;
    @FXML
    TableColumn nombreUsuario;
    Persona alumno;
    ArrayList<Persona> lista;

    @FXML
    public void verDatos() {
        lista = conn.verDatosAlumno();

        datos = FXCollections.observableArrayList();
        for (Persona alumno : lista) {
            datos.add(alumno);
        }
        miTabla.setItems(datos);

        this.idAlumno.setCellValueFactory(new PropertyValueFactory("idAlumno"));
        this.nombreAlumno.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.ciudad.setCellValueFactory(new PropertyValueFactory("ciudad"));
        this.estado.setCellValueFactory(new PropertyValueFactory("estado"));
        this.nombreUsuario.setCellValueFactory(new PropertyValueFactory("nombreUsuario"));
        System.out.println("Fin table");

        //System.out.println(conn.status());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
