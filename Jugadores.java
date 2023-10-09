import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import clases.Jugador;
public class Jugadores{
    public static void main(String[] args){
        ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
        String bddUrl = "jdbc:mysql://localhost:3306/plantel";
        String bddUsr = "root";
        String bddPwd = "admin123456";
        String bddDriver = "com.mysql.cj.jdbc.Driver";
        String bddQuery = "SELECT * FROM jugadores";

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
        int i = 0;
        int indiceJugador = 0;
        int indiceArquero = 0;
        for(Jugador aux : listaJugadores){
            System.out.println(i);
            System.out.println(aux);
            i ++;
        }
        System.out.println("Ingrese el jugador que quiere patear el penal");
        indiceJugador = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese arquero");
        indiceArquero = Integer.parseInt(System.console().readLine());
        listaJugadores.get(indiceJugador).pateaPenal(listaJugadores.get(indiceArquero));
    }
} 