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
    public void pateaPenal(){
        String direccion;
        System.out.println("Patea " + this.nombre);
        System.out.println("Donde patea el penal?");
        direccion = System.console().readLine();
        switch(direccion){
            case "centro":
                break;
            case "derecha":
                break;
            case "izquierda":
                break;
        }
    }   
    @Override
    public void pase(){

    }
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