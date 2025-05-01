package Ejercicio1;
//Creacion clase Cursos
public class Cursos {
    public String nombre;
    public String codigo;
    public int creditos;

    public Cursos(String nombre, String codigo, int creditos){
        this.nombre=nombre;
        this.codigo=codigo;
        this.creditos=creditos;
    }

    public void MostrarInfo(){
        System.out.println("Nombre del curso: "+nombre);
        System.out.println("Codigo del curso: "+codigo);
        System.out.println("Creditos: "+creditos);
    }

    public void ActualizarCreditos(int nuevo_valor) {
        if (nuevo_valor > 0) {
            this.creditos = nuevo_valor;
            System.out.println("Creditos actualizados a: "+creditos);
        } else {
            System.out.println("El numero de creditos debe ser mayor a 0. ");
        }
    }
}
