public class Articulos {

    public static void main(String[] args) {

        char[] codigo = {
                'A', 'B', 'A', 'B', 'A',
                'B', 'A', 'B', 'A', 'B',
                'X'
        };

        double[] precio = {
                50, 80, 30, 100, 60,
                40, 75, 90, 25, 120,
                0
        };

        int[] cantidad = {
                10, 5, 20, 8, 15,
                12, 6, 10, 25, 4,
                0
        };

        int articulosA = 0;
        int articulosB = 0;

        double importeA = 0;
        double importeB = 0;

        for (int i = 0; codigo[i] != 'X'; i++) {

            if (codigo[i] == 'A') {

                articulosA = articulosA + cantidad[i];
                importeA = importeA + (precio[i] * cantidad[i]);

            } else if (codigo[i] == 'B') {

                articulosB = articulosB + cantidad[i];
                importeB = importeB + (precio[i] * cantidad[i]);
            }
        }

        System.out.println("Artículos de categoría A: " + articulosA);
        System.out.println("Importe total categoría A: $" + importeA);

        System.out.println("Artículos de categoría B: " + articulosB);
        System.out.println("Importe total categoría B: $" + importeB);
    }
}