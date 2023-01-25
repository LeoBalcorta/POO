package HelloWorld.src;
import javax.swing.JOptionPane;
public class CambioDivisas {

    public static void main(String[] args){
        //Definimos variables

        String pesosADolarString = JOptionPane.showInputDialog("¿Cuánto dinero quieres cambiar?");

        String tipoDeCambioString = JOptionPane.showInputDialog("¿Cuál es el tipo de cambio?");
		
        //Convertimos pesosADolarString a número
        int pesosADolarInt = Integer.parseInt(pesosADolarString);

        int tipoDeCambioInt = Integer.parseInt(tipoDeCambioString);

        int pesosADolarRes = pesosADolarInt * tipoDeCambioInt;
		
        JOptionPane.showMessageDialog(null, pesosADolarInt + " pesos son " + pesosADolarRes + " dolares",
				"Resultado", JOptionPane.WARNING_MESSAGE);
    }
    
}
