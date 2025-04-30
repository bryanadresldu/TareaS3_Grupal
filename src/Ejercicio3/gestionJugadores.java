package Ejercicio3;
//Ejercicio 3: Gestión de Jugadores 3
public class gestionJugadores {
    public static void main(String[] args) {
        Jugadores jugadores1 = new Jugadores("Cristiano Ronaldo",7,"Delantero");
        jugadores1.mostrarInfo();
        jugadores1.posicionActualizada("Defensa");
        jugadores1.mostrarInfo();
    }
}
