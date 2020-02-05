package basedatos;

/**
 *
 * @author Thomas
 */
public class Persona {

    int idAlumno;
    String nombre, ciudad, estado, nombreUsuario;

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    public void verAtributos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Estado: "+estado);
        System.out.println("NombreU: "+nombreUsuario);
        System.out.println("Ciudad: "+ciudad);
        System.out.println("id: "+idAlumno);
    }

}
