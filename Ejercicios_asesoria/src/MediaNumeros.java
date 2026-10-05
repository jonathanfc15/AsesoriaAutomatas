import java.util.Scanner;
//Ejercico 5.1 y 5.4
public class MediaNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero;
        double suma = 0;
        int cantidad = 0;

        do {
            System.out.print("Ingresa un número: ");
            numero = entrada.nextDouble();

            if (numero >= 0) {
                suma = suma + numero;
                cantidad++;
            }

        } while (numero >= 0);

        if (cantidad > 0) {
            double media = suma / cantidad;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }
    }
}