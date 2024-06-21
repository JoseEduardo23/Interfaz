import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        //Entrada de usuario de los dialogos
        String primernumero = JOptionPane.showInputDialog("Introduzca el prmer numero: ");
        String segundonumero = JOptionPane.showInputDialog("Introduzca el segundo numero: ");

        //Convierte entradas String en valores int
            double numero1 = Double.parseDouble(primernumero);
            double numero2 = Double.parseDouble(segundonumero);
            double suma = numero1 + numero2;
            double resta = numero1 - numero2;
            double multiplica = numero1 * numero2;
            double divisor = numero1 / numero2;

        //Muestra de resultados en un dialogo
        JOptionPane.showMessageDialog(null, "La suma es: " + suma, "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multiplica, "Multiplicacion de dos enteros", JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog(null, "la resta es: " + resta, "Resta de dos enteros", JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog(null, "La division es: " + divisor, "Divisiond de dos enteros", JOptionPane.PLAIN_MESSAGE);
    }
}