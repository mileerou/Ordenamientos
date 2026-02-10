// El Gnome sort tiene una complejidad de O(n^2) en el peor caso.

public class Gnomesort <T extends Comparable<T>> {

    public static void gnomeSort(Integer[] arreglo) {
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
    
    private static void intercambiar(Integer[] arreglo, int i, int j) {
        Integer temp = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temp;
    }
}

