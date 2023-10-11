package funciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import clases.Jugador;

public class Conexion {    
    private static ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
    private static String bddUrl = "jdbc:mysql://localhost:3306/plantel";
    private static String bddUsr = "root";
    private static String bddPwd = "admin123456";
    private static String bddDriver = "com.mysql.cj.jdbc.Driver";
    private static String bddQuery = "SELECT * FROM jugadores";

    public static ArrayList<Jugador> listaJugadores(){
        try (Connection con = DriverManager.getConnection(bddUrl,bddUsr,bddPwd)){
            Class.forName(bddDriver);
            Statement consulta = con.createStatement();
            ResultSet rs = consulta.executeQuery(bddQuery);
            while(rs.next()){
                listaJugadores.add(new Jugador(rs.getString("nombre"),
                                            rs.getString("posicion"),
                                            rs.getDouble("altura"),
                                            rs.getDouble("fuerza"),
                                            rs.getDouble("velocidad"),
                                            rs.getInt("sueldo")));
            }
        }catch(ClassNotFoundException e){
            System.out.println("Driver no encontrado");
            e.printStackTrace();
        }catch(SQLException e){
            System.out.println("Error en la consulta: " + bddQuery);
            e.printStackTrace();
        }
        return listaJugadores;
    }   
}
