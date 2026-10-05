public class Media100Numeros {
//Ejercicio 5.8
    public static void main(String[] args) {

        int[] numeros = {
                10, -5, 20, -10, 15, -8, 30, -20, 25, -15,
                12, -6, 18, -12, 22, -4, 16, -14, 28, -18,
                11, -3, 21, -9, 14, -7, 19, -11, 24, -13,
                13, -2, 17, -5, 23, -10, 26, -16, 29, -19,
                8, -4, 27, -8, 32, -12, 35, -14, 31, -6,
                9, -3, 34, -7, 36, -11, 38, -15, 40, -20,
                7, -2, 33, -9, 37, -13, 39, -17, 42, -21,
                6, -1, 41, -5, 43, -10, 45, -14, 44, -18,
                5, -4, 46, -8, 48, -12, 47, -16, 50, -20,
                4, -3, 49, -7, 51, -11, 52, -15, 55, -19
        };

        int sumaPositivos = 0;
        int sumaNegativos = 0;

        int cantidadPositivos = 0;
        int cantidadNegativos = 0;

        for (int i = 0; i < 100; i++) {

            if (numeros[i] > 0) {
                sumaPositivos = sumaPositivos + numeros[i];
                cantidadPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos = sumaNegativos + numeros[i];
                cantidadNegativos++;
            }
        }

        double mediaPositivos = (double) sumaPositivos / cantidadPositivos;
        double mediaNegativos = (double) sumaNegativos / cantidadNegativos;

        System.out.println("Media de números positivos: " + mediaPositivos);
        System.out.println("Media de números negativos: " + mediaNegativos);
    }
}