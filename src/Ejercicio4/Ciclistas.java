package Ejercicio4;
//Creacion clase Ciclistas
public class Ciclistas {
    public String nombre;
    public int edad;
    public double kilometrosRecorridos;
    public double promedioKilometros;

    //Metodo constructor
    public Ciclistas(String nombre, int edad, double kilometrosRecorridos){
        this.nombre=nombre;
        this.edad=edad;
        this.kilometrosRecorridos =kilometrosRecorridos;
    }
    // Metodo para mostrar Informacion
    public void mostrarInformacion(){
        System.out.println("\n-------------  Informacion del ciclista -------------");
        System.out.println("Nombre del ciclista: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Kilometros recorridos: "+ kilometrosRecorridos+" km");
    }
    // Metodo para actualizar los kilometros recorridos
    public void actualizarKilometros(double nuevosKilometros){
            kilometrosRecorridos+=nuevosKilometros;
        System.out.println("-------------  Informacion actualizada -------------");
        System.out.println("Kilometros recorridos:" + kilometrosRecorridos);
        System.out.println("----------------------------------------------------");
        }

    // Metodo para calcular el promedio de kilómetros por mes
        public void promedioKilometros(){
            promedioKilometros=Math.floor(kilometrosRecorridos/12);
            System.out.println("----------   Kilómetros recorridos por mes ----------");
            System.out.println("Kilometros promedio:" + promedioKilometros);
            System.out.println("----------------------------------------------------");
        }
}
