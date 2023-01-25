
package HelloWorld.src;
import javax.swing.JOptionPane;
public class LecturaJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Definimos variables
		
		String entrada = JOptionPane.showInputDialog("¿Como te llamas?");
		// Resultado
		
		JOptionPane.showMessageDialog(null,"Hola" + entrada + "!", "Saludo", JOptionPane.INFORMATION_MESSAGE);
		
		// JOptionPane tambien se puede usar para leer datos númericos
		
		String numberString = JOptionPane.showInputDialog("Dame un número entero: ");
		
		int myInteger = Integer.parseInt(numberString);
		int resultado = (int) Math.pow(myInteger, 3);
		
		JOptionPane.showMessageDialog(null, myInteger + " elevado al cubo es " + resultado,
				"Resultado", JOptionPane.WARNING_MESSAGE);
	}
	

}

