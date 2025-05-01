package Ejercicio2;
//Ejercicio 2:  Gestión de Registro de Libros
public class gestionLibros {

    public static void main(String[] args) {
        //Creacion de los objetos libros
        Libros libro1=new Libros("Don Quijote","Miguel de Cervantes",1605);
        Libros libro2=new Libros("Adios a las armas","Ernest Hemingway",1929);
        //Llamar a los metodos mostrar informacion
        // y llamar al metodo establecer anio para actulizar anio de publicacion
        libro1.mostrarInformacion();
        libro1.establecerAnio(1620);
        libro2.mostrarInformacion();
        libro2.establecerAnio(1950);
    }
}
