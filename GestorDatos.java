import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GestorDatos {
    void ImprimirBoleta() throws IOException {
        File boleta = new File("boleta.txt");
        FileWriter fw = new FileWriter(boleta);
        PrintWriter pw = new PrintWriter(fw);

        pw.println("");
        pw.println("");
        pw.println("");
        pw.println("");
        pw.println("");

        pw.close();
    }

}
