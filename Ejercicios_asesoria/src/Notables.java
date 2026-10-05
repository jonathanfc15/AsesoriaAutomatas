import java.util.Scanner;
//Ejercicio 5.7
public class Notables {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int alumnos;
        double nota;

        System.out.print("Ingresa el número de alumnos: ");
        alumnos = entrada.nextInt();

        for (int i = 1; i <= alumnos; i++) {

            System.out.print("Ingresa la nota del alumno " + i + ": ");
            nota = entrada.nextDouble();

            if (nota >= 7 && nota < 9) {
                System.out.println("Nota notable: " + nota);
            }
        }
    }
}