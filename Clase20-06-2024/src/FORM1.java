import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FORM1 {
    public JPanel Menu1;
    public JButton btnOK;
    public JLabel Label;
    private JButton Eliminar;
    private JTextField Saludotxt;
    private JButton Capturartext;

    public FORM1() {
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText("Hola a todos, soy Eduardo");
            }
        });
        Eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(" ");
            }
        });
        Eliminar.setSize(0,250);
        Capturartext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label.setText(Saludotxt.getText());
            }
        });
    }
}
