public class BusquedaGalopante {

    public static int busquedaGalopante(int[] A, int size, int x) {
        if (size == 0) {
            return -1;
        }

        int linf = 1;

        while (linf * 2 < size && A[linf * 2] < x) {
            linf *= 2;
        }   return BusquedaBinaria.busquedaBinaria(A, linf, Math.min(size - 1, linf * 2), x);
    }
}