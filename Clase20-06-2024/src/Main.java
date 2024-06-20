import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        //Entrada de usuario de los dialogos
        String primernumero = JOptionPane.showInputDialog("Introduzca el prmer numero: ");
        String segundonumero = JOptionPane.showInputDialog("Introduzca el segundo numero: ");

        //Convierte entradas String en valores int

        int numero1 = Integer.parseInt(primernumero);
        int numero2 = Integer.parseInt(segundonumero);
        int suma = numero1 + numero2;
        int multiplica = numero1 * numero2;

        //Muestra de resultados en un dialogo
        JOptionPane.showMessageDialog(null, "La suma es: " + suma, "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multiplica, "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE );

    }
}
// + - * /