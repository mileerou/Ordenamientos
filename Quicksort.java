import java.util.Random;

public class Quicksort {
    
    private static void quickSort(Integer[] arreglo, int indiceMenor, int indiceMayor) {
        
        if (indiceMenor >= indiceMayor) {
            return;
        }

        int indicePivote = new Random().nextInt(indiceMayor - indiceMenor) + indiceMenor;
        int pivote = arreglo[indicePivote];
        intercambiar(arreglo, indicePivote, indiceMayor);
 
        int pi = indiceMenor;
        int pd = indiceMayor;

        while (pi < pd){
            while (arreglo[pi] <= pivote && pi < pd){
                pi++;
            }

            while (arreglo[pd] >= pivote && pi < pd){
                pd--;
            }

            intercambiar(arreglo, pi, pd);
        }

        intercambiar(arreglo, pi, indiceMayor);

        quickSort(arreglo, indiceMenor, pi - 1);
        quickSort(arreglo, pi + 1, indiceMayor);

    }

    private static void intercambiar(Integer[] arreglo, int indice1, int indice2){
        Integer temp = arreglo[indice1];
        arreglo[indice1] = arreglo[indice2];
        arreglo[indice2] = temp;
    }

}
