package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author APS
 */
public class Condicional {
//variables
   public double base;
    public double altura;
//metods
    public void introducirDatos() {
        do {
            String dato = JOptionPane.showInputDialog("Introducir Base.");
            this.base = Double.parseDouble(dato);
        } while (this.validarDato(base));
        do {
            String dato2 = JOptionPane.showInputDialog("Introducir Altura.");
            this.altura = Double.parseDouble(dato2);
        } while (this.validarDato(altura));
        double area = base * altura;
        JOptionPane.showMessageDialog(null, "Área= " + area);
    }

    private boolean validarDato(double dato) {
        if (dato <= 0) {
            JOptionPane.showMessageDialog(null, "ERROR, dato no válido");
            return true;
        } else {
            return false;
        }
    }
}
