public class NumerosPrimos {
    //ejercicio 5.5

    public static void main(String[] args) {

        for (int numero = 2; numero <= 1000; numero++) {

            int divisores = 0;

            for (int i = 1; i <= numero; i++) {

                if (numero % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.println(numero);
            }
        }
    }
}