import java.io.*;
import java.util.Random;

public class Archivos {
    public void generarArchivo(String nombreArchivo, int cantidad){
        Random random = new Random();
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))){
            for (int i = 0; i < cantidad; i++){
                writer.println(random.nextInt(10000));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Integer[] leerArchivo(String nombreArchivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            return reader.lines().map(Integer::parseInt).toArray(Integer[]::new);
        } catch (IOException e) {
            e.printStackTrace();
            return new Integer[0];
        }
    }
}
