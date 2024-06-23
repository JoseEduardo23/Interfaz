import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public JLabel Contrasenia;
    public JLabel Nombre;
    public JTextArea textArea1;
    public JTextArea textArea2;
    public JButton Borra;
    public JButton OKButton;
    public JPanel Login;

    public Login() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = "Jose";
                String password = "123456";

                if (textArea1.getText().equals(user) && textArea2.getText().equals(password)) {
                    JOptionPane.showMessageDialog(null, "INICIO DE SESION EXOITOSO",null, JOptionPane.INFORMATION_MESSAGE );
                }else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto",null, JOptionPane.WARNING_MESSAGE );
                }
            }
        });
        Borra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea2.setText(null);
                textArea1.setText(null);
            }
        });
    }
}
