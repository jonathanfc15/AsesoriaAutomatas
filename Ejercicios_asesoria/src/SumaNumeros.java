public class SumaNumeros {

    public static void main(String[] args) {

        int sumaRepetir = 0;
        int sumaMientras = 0;
        int sumaDesde = 0;

        // Repetir - do while
        int numero = 1;

        do {
            sumaRepetir = sumaRepetir + numero;
            numero++;
        } while (numero <= 100);

        // Mientras - while
        numero = 1;

        while (numero <= 100) {
            sumaMientras = sumaMientras + numero;
            numero++;
        }

        // Desde - for
        for (numero = 1; numero <= 100; numero++) {
            sumaDesde = sumaDesde + numero;
        }

        System.out.println("Suma con repetir: " + sumaRepetir);
        System.out.println("Suma con mientras: " + sumaMientras);
        System.out.println("Suma con desde: " + sumaDesde);
    }
}