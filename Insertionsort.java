// El Insertion sort tiene una complejidad de O(n^2) en el peor caso.

public class Insertionsort {

    public static void insertionSort(Integer[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            Integer valorActual = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > valorActual) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }

            arreglo[j + 1] = valorActual;
        }
    }

}

