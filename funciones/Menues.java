package funciones;
import clases.Jugador;
public class Menues{
    public static void menuPrincipal(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1: Listar Jugadores");
        System.out.println("2: Seleccionar Jugador");
        System.out.println("3: Salir");
    }

    public static void menuJugador(Jugador j){
        System.out.println("Acciones de " + j.getNombre());
        System.out.println("1: Patea penal");
        System.out.println("2: Volver");
    }
}