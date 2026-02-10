// El pancake sort tiene una complejidad de O(n^2) en el peor caso.

public class Pancakesort <T extends Comparable<T>> {

    public static <T extends Comparable<T>> void ordenar(T[] arreglo) {
    int n = arreglo.length;
    for (int tamanoActual = n; tamanoActual > 1; tamanoActual--) {
        int maxIndex = encontrarMaximo(arreglo, tamanoActual);
        if (maxIndex != tamanoActual - 1) {
            if (maxIndex != 0) {
                voltear(arreglo, maxIndex);
            }
            voltear(arreglo, tamanoActual - 1);
        }
    }
}

private static <T extends Comparable<T>> int encontrarMaximo(T[] arreglo, int n) {
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arreglo[i].compareTo(arreglo[maxIndex]) > 0) {
                maxIndex = i;
            }
        }
        return maxIndex;
}


private static <T extends Comparable<T>> void voltear(T[] arreglo, int indice) {
            int inicio = 0;
            while (inicio < indice) {
                T temp = arreglo[inicio];
                arreglo[inicio] = arreglo[indice];
                arreglo[indice] = temp;
                inicio++;
                indice--;
            }
        }
}

