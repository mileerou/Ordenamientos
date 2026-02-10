public class Controller {
    private Archivos archivos;
    private Vista vista;
    
    public Controller() {
        this.archivos = new Archivos();
        this.vista = new Vista();
    }
    
    public void ejecutar() {
        try {
            String nombreArchivo = "numeros.txt";
            int cantidad = 3000;
            
            archivos.generarArchivo(nombreArchivo, cantidad);
            vista.mostrarMensaje("Archivo generado con " + cantidad + " números");
            
            Integer[] datos = archivos.leerArchivo(nombreArchivo);
            vista.mostrarMensaje("Datos leídos correctamente");
            
            Integer[] copia1 = datos.clone();
            Gnomesort.gnomeSort(copia1);
            vista.mostrarMensaje("Gnome Sort ejecutado");
            
            Integer[] copia2 = datos.clone();
            Mergesort.mergeSort(copia2, 0, copia2.length - 1);
            vista.mostrarMensaje("Merge Sort ejecutado");
            
            Integer[] copia3 = datos.clone();
            Quicksort.quickSort(copia3, 0, copia3.length - 1);
            vista.mostrarMensaje("Quick Sort ejecutado");
            
            Integer[] copia4 = datos.clone();
            Radixsort.radixSort(copia4);
            vista.mostrarMensaje("Radix Sort ejecutado");
            
            Integer[] copia5 = datos.clone();
            Insertionsort.insertionSort(copia5);
            vista.mostrarMensaje("Insertion Sort ejecutado");
            
            vista.mostrarMensaje("\n✓ Todos los algoritmos ejecutados correctamente");
            
        } catch (Exception e) {
            vista.mostrarError("Error: " + e.getMessage());
        }
    }
}
