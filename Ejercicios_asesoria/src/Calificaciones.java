import java.util.Scanner;
//Ejercicio 5.6
public class Calificaciones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int alumnos;
        int aprobados = 0;
        double calificacion;

        System.out.print("Ingresa el número de alumnos: ");
        alumnos = entrada.nextInt();

        for (int i = 1; i <= alumnos; i++) {

            System.out.print("Ingresa la calificación del alumno " + i + ": ");
            calificacion = entrada.nextDouble();

            if (calificacion >= 5) {
                aprobados++;
            }
        }

        System.out.println("Total de alumnos aprobados: " + aprobados);
    }
}