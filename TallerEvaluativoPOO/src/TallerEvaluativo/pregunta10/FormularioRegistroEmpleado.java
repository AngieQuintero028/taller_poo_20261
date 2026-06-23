package TallerEvaluativo.pregunta10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioRegistroEmpleado extends JFrame {
    private JPanel JPanel; //panel principal del diseñador
    private JTextField textNombre;
    private JTextField textIdentificacion;
    private JComboBox<String> comboCargo;
    private JTextField textSalario;
    private JTextField textCorreo;
    private JButton buttonRegistrar;
    private JButton buttonLimpiar;
    private JButton buttonSalir;

    public FormularioRegistroEmpleado() {

        try {
            // Buscamos si IntelliJ generó el método automático de inicialización de componentes
            java.lang.reflect.Method setupUI = this.getClass().getDeclaredMethod("$$$setupUI$$$");
            setupUI.setAccessible(true);
            setupUI.invoke(this);
        } catch (Exception ignored) {

        }

        // asignamos a la ventana
        setContentPane(JPanel);
        setTitle("Registro de Empleados - UCaldas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        //Llenar el ComboBox con opciones
        comboCargo.addItem("Seleccione un cargo...");
        comboCargo.addItem("Desarrollador");
        comboCargo.addItem("Vendedor");
        comboCargo.addItem("Administrativo");

        //EVENTO REGISTRAR
        buttonRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = textNombre.getText();
                String identificacion = textIdentificacion.getText();
                String cargo = (String) comboCargo.getSelectedItem();
                String salario = textSalario.getText();
                String correo = textCorreo.getText();

                if (nombre.isEmpty() || identificacion.isEmpty() || salario.isEmpty() || comboCargo.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.", "Campos Incompletos", JOptionPane.WARNING_MESSAGE);
                } else {
                    String mensaje = "¡Empleado registrado con éxito!\n\n" +
                            "Nombre: " + nombre + "\n" +
                            "Identificación: " + identificacion + "\n" +
                            "Cargo: " + cargo + "\n" +
                            "Salario: $" + salario + "\n" +
                            "Correo: " + correo;
                    JOptionPane.showMessageDialog(null, mensaje, "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // EVENTO LIMPIAR
        buttonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNombre.setText("");
                textIdentificacion.setText("");
                textSalario.setText("");
                textCorreo.setText("");
                comboCargo.setSelectedIndex(0);
            }
        });

        // EVENTO SALIR
        buttonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FormularioRegistroEmpleado ventana = new FormularioRegistroEmpleado();
            ventana.setVisible(true);
        });
    }
}