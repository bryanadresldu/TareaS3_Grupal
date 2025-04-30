package Ejercicio4;
//Ejercicio 4: Gestión de Ciclistas 4
public class gestionCiclistas {
    public static void main(String[] args) {
        //Creacion de los objetos ciclistas
        Ciclistas ciclista1=new Ciclistas("Richard Carpaz",31,5400.5);
        Ciclistas ciclista2=new Ciclistas( "Egan Bernal",28,4200);
        Ciclistas ciclista3=new Ciclistas("Primoz Roglic",35,4800.7);

        //Llamar a los metodos mostrar informacion y actualizar kilometros
        //Llamar al metodo para calcular el promedio mensual de cada objeto
        ciclista1.mostrarInformacion();
        ciclista1.actualizarKilometros(120);
        ciclista1.promedioKilometros();

        ciclista2.mostrarInformacion();
        ciclista2.actualizarKilometros(98);
        ciclista2.promedioKilometros();

        ciclista3.mostrarInformacion();
        ciclista3.actualizarKilometros(132);
        ciclista3.promedioKilometros();
    }
}