import java.util.ArrayList;
import java.util.Scanner;
import clases.*;
import funciones.*;
public class Programa {
    public static void main(String[] args){
        boolean salida = true;
        Scanner s = new Scanner(System.in);
        ArrayList<Jugador> plantel = new ArrayList<Jugador>();
        plantel = Conexion.listaJugadores();
        do{
            Menues.menuPrincipal();
            switch(s.nextLine()){
                case "1":
                    int i = 0;
                    for(Jugador aux : plantel){
                        System.out.println("Indice: " + (i + 1));
                        System.out.println("Jugador: " + aux.getNombre());
                        System.out.println("Posicion: " + aux.getPosicion());
                        i ++;
                    }
                    break;
                case "2":
                    
                    
                        

                    break;
                case "3":
                    salida = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta, ingrese nuevamente");
            }
        }while(salida);
    }
}
