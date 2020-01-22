package basededatos;

import java.sql.*;

/**
 *
 * @author Thomas
 */
public class conexion {

    Connection con = null;
    String dir = "192.168.43.134";

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
        String dir = "192.168.43.233";
        try {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            String url = "jdbc:db2://" + dir + ":50000/DG";
            con = DriverManager.getConnection(url, "db2admin", "patinetas45");
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
        String dir = "192.168.43.233";
        try {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            String url = "jdbc:db2://" + dir + ":50000/DG";
            con = DriverManager.getConnection(url, "db2admin", "patinetas45");
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

        String dir = "192.168.43.233";
        try {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            String url = "jdbc:db2://" + dir + ":50000/DG";
            con = DriverManager.getConnection(url, "db2admin", "patinetas45");
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
        String dir = "192.168.43.233";
        try {
            int idS = Integer.parseInt(idState);
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            String url = "jdbc:db2://" + dir + ":50000/DG";
            con = DriverManager.getConnection(url, "db2admin", "patinetas45");
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
        String dir = "192.168.43.217";
        try {
            int idS = Integer.parseInt(idState);
            con = DriverManager.getConnection("jdbc:mysql://" + dir + ":3306/equipoladg?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "equipo", "1234"); //EGLDT 12345
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
        String dir = "192.168.43.217";
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + dir + ":3306/equipoladg?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "equipo", "1234"); //EGLDT 12345
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
        String dir = "192.168.43.217";
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + dir + ":3306/equipoladg?useUnicode=true&useJDBCCompliantTimezoneShif"
                    + "t=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "equipo", "1234");
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
        String dir = "192.168.43.217";
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + dir + ":3306/equipoladg?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "equipo", "1234"); //EGLDT 12345
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
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=LADG";
            con = DriverManager.getConnection(url, "sa", "12345678");
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
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=LADG";
            con = DriverManager.getConnection(url, "sa", "12345678");
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
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=LADG";
            con = DriverManager.getConnection(url, "sa", "12345678");
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
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=LADG";
            con = DriverManager.getConnection(url, "sa", "12345678");
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
