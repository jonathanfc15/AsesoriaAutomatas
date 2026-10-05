import java.util.Scanner;
//Ejercicio 5.2
public class DiasMes {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String mes;
        int año;
        int dias;

        System.out.print("Ingresa el nombre del mes: ");
        mes = entrada.nextLine().toLowerCase();

        System.out.print("Ingresa el año: ");
        año = entrada.nextInt();

        switch (mes) {

            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                dias = 31;
                break;

            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                dias = 30;
                break;

            case "febrero":
                if (año % 400 == 0 || (año % 4 == 0 && año % 100 != 0)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;

            default:
                System.out.println("El mes no es válido.");
                return;
        }

        System.out.println("El mes de " + mes + " tiene " + dias + " días.");
    }
}