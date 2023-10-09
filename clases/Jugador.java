package clases;

public class Jugador implements InterfazJugador{
    private String nombre;
    private String posicion;
    private double altura;
    private double fuerza;
    private double velocidad;
    private int sueldo;

    public Jugador(String n, String p, double a, double f, double v, int s){
        this.nombre = n;
        this.posicion = p;
        this.altura = a;
        this.fuerza = f;
        this.velocidad = v;
        this.sueldo = s;
    }
    
    @Override
    public void patea(){

    }
    @Override
    public void pateaPenal(Jugador arquero){
        String direccion;
        System.out.println("Patea " + this.nombre);
        System.out.println("Donde patea el penal?");
        direccion = System.console().readLine();
        if(direccion.equals(arquero.ataja())){
            //determinar mediante chances, si se ataja o no;
            System.out.println("UUUUUUHHH");
        }else{
            System.out.println("GOOOOOOOOOL!");
        }
    }   
    public String ataja(){
        String resultado = "";
        switch((int)(Math.random() * 3)){
            case 0:
                resultado = "izquierda";
                break;
            case 1:
                resultado = "centro";
                break;
            case 2:
                resultado = "derecha";
                break;
        }
        return resultado;
    }
    @Override
    public void pase(){

    }
    @Override
    public void falta(){

    }
    public String getNombre(){
        return this.nombre;
    }
        
    public String getPosicion(){
        return this.posicion;
    }
    public double getAltura(){
        return this.altura;
    }
    public double getFuerza(){
        return this.fuerza;
    }
    public double getVelocidad(){
        return this.velocidad;
    }
    public int getSueldo(){
        return this.sueldo;
    }

    public String toString(){
        return "Nombre: " + getNombre() + "\n" +
               "Posicion: " + getPosicion() + "\n" +
               "Altura: " + getAltura() + " | " +
               "Fuerza: " + getFuerza() + " | " +
               "Velocidad: " + getVelocidad() + "\n" +
               "Sueldo: " + getSueldo() + "\n";
    }
}