package Ejercicio2;
//Creacion clase Libros
public class Libros {
    public String titulo;
    public String autor;
    public int anioPublicacion;
    //Constructor
    public Libros(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    //Metodo para mostrar informacion
    public void mostrarInformacion(){
        System.out.println("\n-------------  Informacion del libro  -------------");
        System.out.println("Nombre del libro: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Anio de publicacion: "+anioPublicacion);
    }
    //Metodo para actualizar actualizar el año de publicación
    public void establecerAnio(int nuevoAnio){
        anioPublicacion=nuevoAnio;
        System.out.println("-------------  Informacion actualizada -------------");
        System.out.println("Anio de publicacion actualizados:" + anioPublicacion);
        System.out.println("----------------------------------------------------");
    }
}