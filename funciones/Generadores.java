package funciones;

public class Generadores {
    public static String CodCliente(){
        int rand;
        String cod;
        rand = (int)((Math.random()*1) + 1000);
        cod = "EMP" + rand;
        return cod;
    }        
    
    public static void LetraRandom(){
        double rand;
        double randRango;
        double randSumado;
        int ascii;
        for (int i = 0; i < 10; i++){
            /*rand = Math.random();
            System.out.println("Numero generado: " + rand);
            randRango = rand * (90 - 65);
            System.out.println("Numero multiplicado: " + randRango);
            randSumado = randRango + 65;
            System.out.println("Numero sumado: " + randSumado);
            ascii = (int)randSumado;
            System.out.println("Valor Ascii: " + ascii);
            System.out.println("Letra: " + (char)ascii);
            System.out.println();*/
            System.out.println((char)((int)(Math.random() * (90 - 65)) + 65));
        }
    }

    public static String generaPatente(){
        String patenteGenerada = "";
        for(int i = 0; i < 3; i ++){
            patenteGenerada += (char)((int)(Math.random() * (90 - 65)) + 65);
        }   
        for(int i = 0; i < 3; i++){
            patenteGenerada += (int)(Math.random() * 10);
        }     
        return patenteGenerada;
    }
}
