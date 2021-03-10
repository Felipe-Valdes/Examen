import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventanas {

    public void Ventana1() {
        JFrame frame = new JFrame("ICC264");
        JLabel label = new JLabel("Rut Estudiantes ICC264");
        JComboBox ventana = new JComboBox();
        DefaultComboBoxModel ventanaModel = new DefaultComboBoxModel();
        ventana.setModel(ventanaModel);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.add(label);
        frame.add(ventana);
        frame.setVisible(true);

        JButton nuevoEstudiante = new JButton("Nuevo Estudiante");
        frame.add(nuevoEstudiante);
        nuevoEstudiante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana2();

            }
        });
    }

    public void Ventana2() {
            Estudiante estudiante = new Estudiante();
            JFrame frame2 = new JFrame("Agregar Estudiante ICC264");
            JTextField text2 = new JTextField("rut");
            JComboBox ventana2 = new JComboBox();
            DefaultComboBoxModel ventanaModel2 = new DefaultComboBoxModel();
            ventana2.setModel(ventanaModel2);

            frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame2.add(text2);
            frame2.setLayout(new FlowLayout());
            frame2.setSize(400, 400);
            frame2.setLocationRelativeTo(null);
            frame2.add(ventana2);
            frame2.setVisible(true);

            JButton Agregar = new JButton("Agregar");
            frame2.add(Agregar);
            Agregar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new Estudiante();
                }
            });

        }


    }



