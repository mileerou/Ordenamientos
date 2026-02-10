// El radix sort tiene una complejidad de O(d*(n+b)) donde d es el número de dígitos, n es el número de elementos y b es la base del sistema numérico.

public class Radixsort {
    public static void radixSort(Integer[] arreglo) {
        if (arreglo.length == 0) return;
        
        int max = obtenerMaximo(arreglo);
        
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arreglo, exp);
        }
    }
    
    private static int obtenerMaximo(Integer[] arreglo) {
        int max = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > max) max = arreglo[i];
        }
        return max;
    }
    
    private static void countingSort(Integer[] arreglo, int exp) {
        int n = arreglo.length;
        Integer[] salida = new Integer[n];
        int[] conteo = new int[10];
        
        for (int i = 0; i < n; i++) {
            conteo[(arreglo[i] / exp) % 10]++;
        }
        
        for (int i = 1; i < 10; i++) {
            conteo[i] += conteo[i - 1];
        }
        
        for (int i = n - 1; i >= 0; i--) {
            salida[conteo[(arreglo[i] / exp) % 10] - 1] = arreglo[i];
            conteo[(arreglo[i] / exp) % 10]--;
        }
        
        System.arraycopy(salida, 0, arreglo, 0, n);
    }
}
