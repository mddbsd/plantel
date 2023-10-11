package funciones;

import java.util.Scanner;

public class Validaciones {
    private static Scanner s = new Scanner(System.in);
    public static Boolean siNo(String fOp){
        while(!fOp.equals("s") && !fOp.equals("n")){
            System.out.println("Opcion invalida, ingrese nuevamente");
            fOp = s.nextLine();
        }
        if(fOp.equals("s")){
            return true;
        }else{
            return false;
        }   
    }

    public static String validaDireccion(String dir){
        while(!dir.equals("centro") && !dir.equals("izquierda") && !dir.equals("derecha")){
            System.out.println("Ingrese centro, izquierda, derecha");
            dir = s.nextLine();
        }
        return dir;
    }
}
