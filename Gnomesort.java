// El Gnome sort tiene una complejidad de O(n^2) en el peor caso.

public class Gnomesort <T extends Comparable<T>> {

    public static <T extends Comparable<T>> void gnomeSort(T[] arreglo) {
        int indice = 0;
        while (indice < arreglo.length) {
            if (indice == 0 || arreglo[indice].compareTo(arreglo[indice - 1]) >= 0) {
                indice++;
            } else {
                intercambiar(arreglo, indice, indice - 1);
                indice--;
            }
        }
    }
    
    private static <T> void intercambiar(T[] arreglo, int i, int j) {
        T temp = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temp;
    }
}

