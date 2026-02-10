// El Merge sort tiene una complejidad de O(n log n) en el peor caso.

import java.util.Arrays;

public class Mergesort {
    public static void mergeSort(Integer[] arreglo, int izquierda, int derecha){
        int tamano = arreglo.length;

        if (arreglo.length < 2) {
            return;
        }

        int mitad = tamano / 2;
        Integer[] mitadIzquierda = Arrays.copyOfRange(arreglo, 0, mitad);
        Integer[] mitadDerecha = Arrays.copyOfRange(arreglo, mitad, arreglo.length);

        for (int i = 0; i < mitad; i++) {
            mitadIzquierda[i] = (Integer) arreglo[i];
        }
        for (int i = mitad; i < tamano; i++) {
            mitadDerecha[i - mitad] = (Integer) arreglo[i];
        }

        mergeSort(mitadIzquierda, mitad, mitad);
        mergeSort(mitadDerecha, mitad, mitad);

        merge(arreglo, mitadIzquierda, mitadDerecha);
    }

    private static void merge(Integer[] arreglo, Integer[] mitadIzquierda, Integer[] mitadDerecha){
        int i = 0, j = 0, k = 0;

        while(i < mitadIzquierda.length && j < mitadDerecha.length){
            if (mitadIzquierda[i] <= mitadDerecha[j]){
                arreglo[k] = mitadIzquierda[i];
                i++;
            } else {
                arreglo[k] = mitadDerecha[j];
                j++;
            }
            k++;
        }

        while (i < mitadIzquierda.length){
            arreglo[k] = mitadIzquierda[i];
            i++;
            k++;
        }

        while (j < mitadDerecha.length){
            arreglo[k] = mitadDerecha[j];
            j++;
            k++;
        }
    }

    
}

