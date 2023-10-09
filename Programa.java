import java.util.Scanner;
import clases.*;
import funciones.*;
public class Programa {
    public static void main(String[] args){
        boolean salida = true;
        Scanner s = new Scanner(System.in);
        do{
            Menues.menuPrincipal();
            switch(s.nextLine()){
                case "1":
                    
                    break;
                case "2":
                    salida = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta, ingrese nuevamente");
            }
        }while(salida);
    }
}
