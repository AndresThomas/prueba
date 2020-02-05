package basedatos;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Thomas
 */
public class conexion {

    Connection con = null;
    String dir = "192.168.109.179";
    String dir1 = "192.168.1.143";//leo
    String dir2 = "192.168.1.143";//diana
    String dir3 = "192.168.1.143";//gabi
    Persona alumno;

    ArrayList<Persona> listaPersona = new ArrayList<>();

    public ArrayList<Persona> verDatosAlumno() {
        int idCity = 0, idUser = 0, idState = 0;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://" + dir + ":5432/equipoladg", "postgres", "root");

            PreparedStatement state = con.prepareStatement("SELECT * FROM alumno");
            ResultSet rs = state.executeQuery();

            while (rs.next()) {
                alumno = new Persona();
                alumno.setIdAlumno(Integer.parseInt(rs.getString("idalumno")));
                alumno.setNombre(rs.getString("nombre"));
                idCity = Integer.parseInt(rs.getString("idciudad"));
                idUser = Integer.parseInt(rs.getString("idusuario"));
                con.close();
                //con = Driver
                PreparedStatement state2 = con.prepareStatement("SELECT * FROM ciudad where idciudad =" + idCity + " ");
                ResultSet rs2 = state2.executeQuery();
                while (rs2.next()) {
                    alumno.setCiudad(rs2.getString("nombre"));
                    idState = Integer.parseInt(rs2.getString("idestado"));
                }
                PreparedStatement state3 = con.prepareStatement("SELECT * FROM estado where idestado =" + idState + " ");
                ResultSet rs3 = state3.executeQuery();
                while (rs3.next()) {
                    alumno.setEstado(rs3.getString("nombre"));
                }
                PreparedStatement state4 = con.prepareStatement("SELECT * FROM usuario where idusuario =" + idUser + " ");
                ResultSet rs4 = state4.executeQuery();

                while (rs4.next()) {
                    alumno.setNombreUsuario(rs4.getString("nombre"));
                }

                alumno.verAtributos();
                listaPersona.add(alumno);
                System.out.println("*************************");
            }
            return listaPersona;

        } catch (Exception e) {
            System.out.println("Ocurrio un error C: " + e.getMessage());
        }
        return null;
    }

    public void cGabi() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://" + dir3 + ":1433;databaseName=LADG";
            con = DriverManager.getConnection(url, "sa", "12345678");
        } catch (Exception e) {
            System.out.println("Error al conectarG:" + e);
        }
    }

    public void cDiana() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + dir2 + ":3306/equipoladg?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "equipo", "1234"); //EGLDT 12345
        } catch (Exception e) {
            System.out.println("Error al conectarD:" + e);
        }
    }

    public void cLeo() {
        try {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            String url = "jdbc:db2://" + dir1 + ":50000/DG";
            con = DriverManager.getConnection(url, "db2admin", "patinetas45");
        } catch (Exception e) {
            System.out.println("Error al conectarL:" + e);
        }
    }

    public void enviarDatos(String nameState, String idState) {
        try {
            int idS = Integer.parseInt(idState);
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://" + dir + ":5432/equipoladg", "postgres", "root");
            PreparedStatement state = con.prepareStatement("INSERT INTO estado (idestado,nombreestado)"
                    + " values(" + idS + "," + "'" + nameState + "'" + ")");
            ResultSet result = state.executeQuery();
        } catch (Exception e) {
            System.out.println("Ocurrio un error C: " + e.getMessage());
        }
    }

    public void enviarDatos(String nameUser, int idUser) {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://" + dir + ":5432/equipoladg", "postgres", "root");
            PreparedStatement state = con.prepareStatement("INSERT INTO usuario (idusuario,nombreusuario)"
                    + " values(" + idUser + "," + "'" + nameUser + "'" + ")");
            ResultSet result = state.executeQuery();
        } catch (Exception e) {
            System.out.println("Ocurrio un error C: " + e.getMessage());
        }
    }

    public void enviarDatos(String idA, String nombreA, String idC, int idUser) {

        int idAl = Integer.parseInt(idA);
        int idCA = Integer.parseInt(idC);
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://" + dir + ":5432/equipoladg", "postgres", "root");
            int idc = Integer.parseInt(idC);

            PreparedStatement state = con.prepareStatement("INSERT INTO alumno (idalumno,nombre,idciudad,idusuario)"
                    + " values(" + idAl + "," + "'" + nombreA + "'" + "," + idC + "," + idUser + ")");
            ResultSet result = state.executeQuery();
        } catch (Exception e) {
            System.out.println("Ocurrio un error C: " + e.getMessage());
        }
    }

    public void enviarDatosCiudad(String nombreCiudad, String idC, int idS) {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://" + dir + ":5432/equipoladg", "postgres", "root");
            int idCiudad = Integer.parseInt(idC);

            PreparedStatement state = con.prepareStatement("INSERT INTO ciudad (idciudad,nombre)"
                    + " values(" + idCiudad + "," + "'" + nombreCiudad + "'" + idS + ")");
            ResultSet result = state.executeQuery();
        } catch (Exception e) {
            System.out.println("Ocurrio un error C: " + e.getMessage());
        }
    }

    public void enviarDatosLeo(String idA, String nombreA, String idC, int idUser) {
        int idAl = Integer.parseInt(idA);
        int idCA = Integer.parseInt(idC);

        try {
            cLeo();
            String sql = "insert into \"NULLID\".\"Alumno\" (\"idAlumno\",\"nombreAlumno\",\"idCiudadAlumno\""
                    + ",\"idUser\") values (?,?,?,?)";
            PreparedStatement in = con.prepareCall(sql);
            in.setInt(1, idAl);
            in.setString(2, nombreA);
            in.setInt(3, idCA);
            in.setInt(4, idUser);
            try {
                int valor = in.executeUpdate();
            } catch (Exception e) {
                System.out.println("Error :");
            }
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
    }

    public void enviarDatosLeo(String idCiudad, String nombreCiudad, int idEstado) {

        int idC = Integer.parseInt(idCiudad);
        try {
            cLeo();
            String sql = "insert into \"NULLID\".\"Ciudad\" (\"idciudad\",\"nombreciudad\",\"idestado\") values (?,?,?)";
            PreparedStatement in = con.prepareCall(sql);
            in.setInt(1, idC);
            in.setString(2, nombreCiudad);
            in.setInt(3, idEstado);
            try {
                int valor = in.executeUpdate();
                System.out.println(":)");
            } catch (Exception e) {
                System.out.println("Error :");
            }
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
    }

    public void enviarDatosLeo(String nameUser, int idUser) {

        try {
            cLeo();
            String sql = "insert into \"NULLID\".\"usuario\" (\"idusuario\",\"nombreusuario\") values (?,?)";
            PreparedStatement in = con.prepareCall(sql);
            in.setInt(1, idUser);
            in.setString(2, nameUser);
            try {
                int valor = in.executeUpdate();
                System.out.println(":)");
            } catch (Exception e) {
                System.out.println("Error :");
            }
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }

    }

    public void enviarDatosLeo(String nameState, String idState) {

        try {
            int idS = Integer.parseInt(idState);
            cLeo();
            String sql = "insert into \"NULLID\".\"estado\" (\"idestado\",\"nombreestado\") values (?,?)";
            PreparedStatement in = con.prepareCall(sql);
            in.setInt(1, idS);
            in.setString(2, nameState);
            try {
                int valor = in.executeUpdate();
                System.out.println(":)");
            } catch (Exception e) {
                System.out.println("Error :");
            }
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
    }

    public void enviarDatosDiana(String nameState, String idState) {

        try {
            int idS = Integer.parseInt(idState);
            cDiana();
            PreparedStatement state = con.prepareStatement("INSERT INTO estado(idestado,nombreestado)"
                    + "VALUES(?,?)");
            state.setInt(1, idS);
            state.setString(2, nameState);
            state.execute();
        } catch (Exception e) {
            System.out.println("Ocurrio un error C: " + e.getMessage());
        }
    }

    public void enviarDatosDiana(String nameUser, int idUser) {

        try {
            cDiana();
            PreparedStatement state = con.prepareStatement("INSERT INTO usuario(idusuario,nombreusuario)"
                    + "VALUES(?,?)");
            state.setInt(1, idUser);
            state.setString(2, nameUser);
            state.execute();
        } catch (Exception e) {
            System.out.println("Ocurrio un error C: " + e.getMessage());
        }
    }

    public void enviarDatosDiana(String idA, String nombreA, String idC, int idUser) {
        int idAl = Integer.parseInt(idA);
        int idCA = Integer.parseInt(idC);

        try {
            cDiana();
            
            int idc = Integer.parseInt(idC);
            PreparedStatement state = con.prepareStatement("INSERT INTO alumno(idAlumno,nombreAlumno,idCiudadAl)"
                    + "VALUES(?,?,?,?)");
            state.setString(1, idA);
            state.setString(2, nombreA);
            state.setString(3, idC);
            state.setInt(4, idUser);
            state.execute();
        } catch (Exception e) {
            System.out.println("Ocurrio un error C: " + e.getMessage());
        }

    }

    public void enviarDatosDiana(String idCiudad, String nombreCiudad, int idEstado) {
        int idC = Integer.parseInt(idCiudad);

        try {
            cDiana();
            PreparedStatement state = con.prepareStatement("INSERT INTO ciudad(idciudad,nombreciudad,idestado)"
                    + "VALUES(?,?,?)");
            state.setInt(1, idC);
            state.setString(2, nombreCiudad);
            state.setInt(3, idEstado);
            state.execute();
        } catch (Exception e) {
            System.out.println("Ocurrio un error C: " + e.getMessage());
        }

    }

    public void enviarDatosGabi(String nameUser, int idUser) {
        try {
            cGabi();
            ResultSet rs;
            Statement st = con.createStatement();
            String consulta = "insert into Usuario(idUsuario,Nombre) VALUES (" + idUser + "'" + nameUser + "')";
            st.execute(consulta);
        } catch (Exception e) {
            System.out.println("Error G:" + e.getMessage());
        }
    }

    public void enviarDatosGabi(String nameState, String idState) {
        try {
            cGabi();
            ResultSet rs;
            Statement st = con.createStatement();
            String consulta = "insert into Estado(idEstado,Nombre) VALUES (" + idState + "'" + nameState + "')";
            st.execute(consulta);
        } catch (Exception e) {
            System.out.println("Error G:" + e.getMessage());
        }
    }

    public void enviarDatosGabi(String idA, String nombreA, String idC, int idUser) {
        try {
            cGabi();
            ResultSet rs;
            Statement st = con.createStatement();
            String consulta = "insert into Alumno(idAlumno,Nombre,idCiudad,idUsuario) VALUES "
                    + "(" + idA + "'" + nombreA + idC + idUser + "')";
            st.execute(consulta);
        } catch (Exception e) {
            System.out.println("Error G:" + e.getMessage());
        }
    }

    public void enviarDatosGabi(String idCiudad, String nombreCiudad, int idEstado) {
        try {
            cGabi();
            ResultSet rs;
            Statement st = con.createStatement();
            String consulta = "insert into Ciudad(idCiudad,Nombre,idEstado) VALUES "
                    + "(" + idCiudad + "'" + nombreCiudad + idEstado + "')";
            st.execute(consulta);
        } catch (Exception e) {
            System.out.println("Error G:" + e.getMessage());
        }
    }

    public boolean status() {
        if (con != null) {
            return true;
        } else {
            return false;
        }
    }
}
