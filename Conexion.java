/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Conexion {

    Connection con = null;
    String dir = "192.168.43.94";
    String dirM = "192.168.1.156";//Mysql
    String dirD = "192.168.1.155";//Db2
    String dirSql = "192.168.1.157";//Sql

    String dbSql = "LADG";
    String userSql = "sa";
    String passwordSql = "12345678";
    String portSql = "1433";

    String userMysql = "equipo";
    String passwordMysql = "1234";
    String dbMySql = "equipoladg";
    String portMysql = "";

    String userDb2 = "db2admin";
    String passwordDb2 = "patinetas45";
    String dbDb2 = "DG";
    String portDb2 = "50000";

    Persona alumno;

    ArrayList<Persona> listaPersona = new ArrayList<>();

    public ArrayList<Persona> verDatosAlumno() {
        int idCity = 0, idUser = 0, idState = 0;
        try {
            PreparedStatement state = con.prepareStatement("SELECT * FROM alumno");
            ResultSet rs = state.executeQuery();

            while (rs.next()) {
                alumno = new Persona();
                alumno.setIdAlumno(Integer.parseInt(rs.getString("idalumno")));
                alumno.setNombre(rs.getString("nombre"));
                idCity = Integer.parseInt(rs.getString("idciudad"));
                idUser = Integer.parseInt(rs.getString("idusuario"));
                //con.close();
                // conectarse con la db que tiene ciudad                cambiar alumno por ciudad
                PreparedStatement state2 = con.prepareStatement("SELECT * FROM alumno where idciudad =" + idCity + " ");
                ResultSet rs2 = state2.executeQuery();
                while (rs2.next()) {
                    alumno.setCiudad(rs2.getString("nombre"));
                    //idState = Integer.parseInt(rs2.getString("idestado"));
                }
                //
                // conectarse con la db que tiene estados                   cambiar alumno por estado
               /* PreparedStatement state3 = con.prepareStatement("SELECT * FROM alumno where idestado =" + idState + " ");
                ResultSet rs3 = state3.executeQuery();
                while (rs3.next()) {
                    alumno.setEstado(rs3.getString("nombre"));
                }*/
                //
                // conectarse con la db que tiene usuarios              cambiar alumno por usuario
                PreparedStatement state4 = con.prepareStatement("SELECT * FROM alumno where idusuario =" + idUser + " ");
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

    public void cLocal() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://" + dir + ":5432/equipoladg", "postgres", "root");
        } catch (Exception e) {
            System.out.println("Error al conectar L:" + e);
        }
    }
    public void cLocal2() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://" + dir + ":5432/bdesc", "postgres", "root");
        } catch (Exception e) {
            System.out.println("Error al conectar L:" + e);
        }
    }

    public void cSql() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://" + dirSql + ":" + portSql + ";databaseName=" + dbSql;
            con = DriverManager.getConnection(url, userSql, passwordSql);
        } catch (Exception e) {
            System.out.println("Error al conectarG:" + e);
        }
    }

    public void cMysql() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + dirM + ":" + portMysql + "/" + dbMySql + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    userMysql, passwordMysql); //EGLDT 12345
        } catch (Exception e) {
            System.out.println("Error al conectarD:" + e);
        }
    }

    public void cDb2() {
        try {
            Class.forName("com.ibm.db2.jcc.DB2Driver");
            String url = "jdbc:db2://" + dirD + ":" + portDb2 + "/" + dbDb2;
            con = DriverManager.getConnection(url, userDb2, passwordDb2);
        } catch (Exception e) {
            System.out.println("Error al conectarL:" + e);
        }
    }

    //ciudades
    public void enviarDatosSql(int idCiudad, String nombreCiudad) {
        try {
            cSql();
            ResultSet rs;
            Statement st = con.createStatement();
            String consulta = "insert into Ciudad(idciudad,nombreciudad) VALUES "
                    + "(" + idCiudad + ",'" + nombreCiudad + "')";
            st.execute(consulta);
        } catch (Exception e) {
            System.out.println("Error G:" + e.getMessage());
        }
    }

    //alumnos
    public void enviarDatosSql(int ida, String nombre, int idciudad) {
        try {
            cSql();
            ResultSet rs;
            Statement st = con.createStatement();
            String consulta = "insert into Alumno(idciudad,nombre) VALUES "
                    + "(" + ida + ",'" + nombre + "," + idciudad + "')";
            st.execute(consulta);
        } catch (Exception e) {
            System.out.println("Error G:" + e.getMessage());
        }
    }

    //ciudades
    public void enviarDatosDb2(int idCiudad, String nombreCiudad) {
        try {
            cDb2();
            String sql = "insert into \"NULLID\".\"Ciudad\" (\"idCiudad\",\"nombre\") values (?,?)";
            PreparedStatement in = con.prepareCall(sql);
            in.setInt(1, idCiudad);
            in.setString(2, nombreCiudad);
            try {
                int valor = in.executeUpdate();
                System.out.println(":)");
            } catch (Exception e) {
                System.out.println("Error :" + e);
            }
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
    }

    //alumnos
    public void enviarDatosDb2(int idCiudad, String nombreCiudad, int idciudad) {
        try {
            cDb2();
            String sql = "insert into \"NULLID\".\"Alumno\" (\"idAlumno\",\"nombreAlumno\",\"idCiudadAlumno\") values (?,?,?)";
            PreparedStatement in = con.prepareCall(sql);
            in.setInt(1, idCiudad);
            in.setString(2, nombreCiudad);
            in.setInt(3, idciudad);
            try {
                int valor = in.executeUpdate();
                System.out.println(":)");
            } catch (Exception e) {
                System.out.println("Error :" + e);
            }
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
    }

    //ciudades
    public void enviarDatosMysql(int idCiudad, String nombreCiudad) {
        try {
            cMysql();
            PreparedStatement state = con.prepareStatement("INSERT INTO ciudad(idciudad,nombreciudad)"
                    + "VALUES(?,?)");
            state.setInt(1, idCiudad);
            state.setString(2, nombreCiudad);
            state.execute();
        } catch (Exception e) {
            System.out.println("Ocurrio un error C: " + e.getMessage());
        }
    }

    //alumnos
    public void enviarDatosMysql(int idCiudad, String nombreCiudad, String idciudad) {
        try {
            cMysql();
            PreparedStatement state = con.prepareStatement("INSERT INTO alumno(idalumno,nombrealumno,idciudadalumno)"
                    + "VALUES(?,?,?)");
            state.setInt(1, idCiudad);
            state.setString(2, nombreCiudad);
            state.setString(3, idciudad);
            state.execute();
        } catch (Exception e) {
            System.out.println("Ocurrio un error C: " + e.getMessage());
        }
    }

    //ciudades
    public void enviarDatos(int idC, String nombreCiudad) {
        try {
            PreparedStatement state = con.prepareStatement("INSERT INTO ciudad (idciudad,nombre)"
                    + " values(" + idC + "," + "'" + nombreCiudad + "'" + ")");
            /*ResultSet result = */
            state.executeQuery();
        } catch (Exception e) {
            if (e.getMessage().equals("La consulta no retornó ningun resultado.")) {
                System.out.println("Ocurrio un error C: " + e.getMessage());
            }
        }
    }

    //alumnos
    public void enviarDatos(int idA, String nombreA, String idC) {

        try {

            PreparedStatement state = con.prepareStatement("INSERT INTO alumno (idalumno,nombre,idciudad)"
                    + " values(" + idA + ",'" + nombreA + "','" + idC + "'" + ")");
            state.executeQuery();
        } catch (Exception e) {
            if (e.getMessage().equals("La consulta no retornó ningun resultado.")) {
                System.out.println("Ocurrio un error C: " + e.getMessage());
            }
        }
    }

    public void enviar100(int option) {
        switch (option) {
            case 1: {
                for (int i = 0; i < 100; i++) {
                    enviarDatosSql(i, "ciudad" + i);
                }
                break;
            }
            case 2: {
                for (int i = 0; i < 100; i++) {
                    enviarDatos(i, "ciudad" + i);
                }
                break;
            }

            case 3: {
                for (int i = 0; i < 100; i++) {
                    enviarDatosMysql(i, "ciudad" + i);
                }
                break;
            }
            case 4: {
                for (int i = 0; i < 100; i++) {
                    enviarDatosDb2(i, "ciudad" + i);
                }
                break;
            }
        }
    }

    public void enviar(int option, int size) {
        switch (option) {
            case 1: {
                for (int i = 0; i < size; i++) {
                    enviarDatosSql(i, "alumno", numAleatorio());
                }
                break;
            }
            case 2: {
                for (int i = 0; i < size; i++) {
                    enviarDatos(i, "alumno" + i, "ciudad" + numAleatorio());
                }
                break;
            }

            case 3: {
                for (int i = 0; i < size; i++) {
                    enviarDatosMysql(i, "alumno" + i, "ciudad" + numAleatorio());
                }
                break;
            }
            case 4: {
                for (int i = 0; i < size; i++) {
                    enviarDatosDb2(i, "alumno" + i,  numAleatorio());
                }
                break;
            }
        }
    }

    public int numAleatorio() {
        return ((int) (Math.random() * 100));
    }

    public boolean status() {
        if (con != null) {
            return true;
        } else {
            return false;
        }
    }

}
