public class Temperaturas {
//ejercicio11
    public static void main(String[] args) {

        double[] maximas = {
                25, 30, 28, 9, 32,
                27, 9, 24, 31, 26,
                29, 33, 22, 9, 35,
                28, 30, 27, 34, 0
        };

        double[] minimas = {
                15, 18, 16, 20, 9,
                14, 9, 12, 17, 13,
                16, 19, 10, 15, 21,
                14, 18, 13, 20, 0
        };

        int dias = 0;
        int errores = 0;

        double sumaMaximas = 0;
        double sumaMinimas = 0;

        for (int i = 0; maximas[i] != 0 || minimas[i] != 0; i++) {

            if (maximas[i] == 9 || minimas[i] == 9) {

                errores++;

            } else {

                sumaMaximas = sumaMaximas + maximas[i];
                sumaMinimas = sumaMinimas + minimas[i];

                dias++;
            }
        }

        double mediaMaxima = sumaMaximas / dias;
        double mediaMinima = sumaMinimas / dias;

        int totalRegistros = dias + errores;

        double porcentajeErrores = (errores * 100.0) / totalRegistros;

        System.out.println("Número de días válidos: " + dias);
        System.out.println("Media máxima: " + mediaMaxima);
        System.out.println("Media mínima: " + mediaMinima);
        System.out.println("Número de errores: " + errores);
        System.out.println("Porcentaje de errores: " + porcentajeErrores + "%");
    }
}