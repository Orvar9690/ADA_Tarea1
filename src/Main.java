import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Tamaño del arreglo: 5.000.000
        int tamano = 5000000;
        int rangoElementos = 10000000;
        int[] A = new int[tamano];
        Random rand = new Random();

        // Generar arreglo con números aleatorios
        for (int i = 0; i < tamano; i++) {
            A[i] = rand.nextInt(rangoElementos) + 1;
        }

        // Ordenar el arreglo usando Merge Sort
        MergeSort.mergeSort(A, 0, A.length - 1);

        // Generar claves aleatorias en las cantidades especificadas
        int[] cantidades = {1000, 5000, 10000, 50000, 100000};

        for (int cantidad : cantidades) {
            int[] claves = new int[cantidad];
            for (int i = 0; i < cantidad; i++) {
                claves[i] = rand.nextInt(rangoElementos) + 1;
            }

            // Medir tiempo de Búsqueda Binaria
            long inicioBinaria = System.nanoTime();
            for (int clave : claves) {
                BusquedaBinaria.busquedaBinaria(A, 0, A.length - 1, clave);
            }
            long finBinaria = System.nanoTime();
            long tiempoBinaria = (finBinaria - inicioBinaria) / 1000000;  // Convertir a milisegundos

            // Medir tiempo de Búsqueda Galopante
            long inicioGalopante = System.nanoTime();
            for (int clave : claves) {
                BusquedaGalopante.busquedaGalopante(A, A.length, clave);
            }
            long finGalopante = System.nanoTime();
            long tiempoGalopante = (finGalopante - inicioGalopante) / 1000000;  // Convertir a milisegundos

            // Imprimir resultados
            System.out.println("Cantidad de claves: " + cantidad);
            System.out.println("Tiempo Búsqueda Binaria: " + tiempoBinaria + " ms");
            System.out.println("Tiempo Búsqueda Galopante: " + tiempoGalopante + " ms");
            System.out.println();
        }
    }
}