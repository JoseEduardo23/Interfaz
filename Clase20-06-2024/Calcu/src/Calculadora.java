import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Calculadora {
    public JTextArea Numero1;
    public JTextArea Numero2;
    public JButton Suma;
    public JButton Divide;
    public JButton Resta;
    public JButton Multiplica;
    public JPanel Menu;
    private JLabel LabelResp;

    public Calculadora() {
        Menu.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Numero1.setText(" ");
            }
        });
        Numero2.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Numero2.setText("");
            }
        });
    }
}
