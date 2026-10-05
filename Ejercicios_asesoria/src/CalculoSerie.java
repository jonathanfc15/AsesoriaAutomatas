import java.util.Scanner;
//Ejerccicio 11
public class CalculoSerie {

    // Funcion  para calcular el factorial de un número
    public static double factorial(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // a): Sumar hasta un número fijo N ingresado por teclado
    public static double calcularIncisoA(double x, int N) {
        double suma = 0;
        for (int n = 0; n <= N; n++) {
            suma += Math.pow(x, n) / factorial(n);
        }
        return suma;
    }

    // b): Sumar hasta que el término x^n / n! sea menor que E
    public static double calcularIncisoB(double x, double E) {
        double suma = 0;
        double termino = 1; // Para n = 0, x^0 / 0! = 1
        int n = 0;

        while (termino >= E) {
            suma += termino;
            n++;
            termino = Math.pow(x, n) / factorial(n);
        }

        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de x: ");
        double x = scanner.nextDouble();

        // a)
        System.out.print("Ingrese el valor entero de N (inciso a): ");
        int N = scanner.nextInt();
        double resultadoA = calcularIncisoA(x, N);
        System.out.println("Resultado inciso a) [N = " + N + "]: " + resultadoA);

        // b)
        double E = 1e-4; // 10^-4
        double resultadoB = calcularIncisoB(x, E);
        System.out.println("Resultado inciso b) [E = " + E + "]: " + resultadoB);

        scanner.close();
    }
}