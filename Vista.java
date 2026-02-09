public class Vista {
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public void mostrarError(String error) {
        System.err.println("ERROR: " + error);
    }
    
    public void mostrarResultado(String nombreAlgoritmo, long tiempoNanos) {
        double tiempoMs = tiempoNanos / 1_000_000.0;
        System.out.printf("  %s: %.4f ms%n", nombreAlgoritmo, tiempoMs);
    }

}
