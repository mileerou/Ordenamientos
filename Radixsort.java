// El radix sort tiene una complejidad de O(d*(n+b)) donde d es el número de dígitos, n es el número de elementos y b es la base del sistema numérico.

public class Radixsort <T extends Comparable<T>> {
    public void ordenar(Integer[] arreglo) {
        int max = obtenerMaximo(arreglo);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            contarSort(arreglo, exp);
        }
    }
}
