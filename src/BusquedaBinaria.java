public class BusquedaBinaria {

    public static int busquedaBinaria(int[] A, int li, int ls, int x) {
        while (li <= ls) {
            int mid = li + (ls - li) / 2;

            if (A[mid] == x) {
                return mid;
            } else if (A[mid] < x) {
                li = mid + 1;
            } else {
                ls = mid - 1;
            }
        }   return -1;  // No encontrado
    }

}