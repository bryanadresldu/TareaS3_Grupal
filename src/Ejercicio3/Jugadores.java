package Ejercicio3;
//Creacion clase Jugadores
public class Jugadores {
    public String nombre;
    public int numero;
    public String posicion;
    public Jugadores(String nombre,int numero,String posicion){
        this.nombre = nombre;
        this.numero = numero;
        this. posicion = posicion;
    }
    public void mostrarInfo(){
        System.out.print("Nombre del jugador: "+nombre);
        System.out.print("\nNumero que identifica al jugador en el equipo : "+numero);
        System.out.print("\nPosición en la que juega: "+posicion);
    }
    public  void posicionActualizada(String nuevaPosicion){
        this.posicion = nuevaPosicion;
        System.out.print("\nLa posicion del jugador "+nombre+" ha sido actualizada a: "+posicion+"\n");
    }
}
