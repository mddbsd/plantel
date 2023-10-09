package funciones;

import java.util.Scanner;

public class Validaciones {
    public static Boolean siNo(String fOp){
        Scanner s = new Scanner(System.in);
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
}
