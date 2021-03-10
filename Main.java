import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ICC264");
        JLabel label = new JLabel("Rut Estudiantes ICC264");
        JComboBox ventana = new JComboBox();
        JButton nuevoEstudiante = new JButton("Nuevo Estudiante");
        DefaultComboBoxModel ventanaModel = new DefaultComboBoxModel();
        ventana.setModel(ventanaModel);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.add(label);
        frame.add(ventana);
        frame.add(nuevoEstudiante);
        frame.setVisible(true);

        


    }
}
