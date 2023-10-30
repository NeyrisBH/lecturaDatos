import java.io.File;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor introduzca la ruta del archivo: ");
        String ruta = leer.nextLine();

        System.out.println(ruta);



        try {
            File archivo = new File(ruta);
            Scanner leerArchivo = new Scanner(archivo);

            System.out.println("Contenido del archivo:");

            while (leerArchivo.hasNextLine()) {
                String linea = leerArchivo.nextLine();
                System.out.println(linea);
            }

            leerArchivo.close();
        } catch (Exception e) {
            System.err.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        } finally {
            leer.close();
        }
    }
}