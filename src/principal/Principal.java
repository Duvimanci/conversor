package principal;

import javax.swing.JOptionPane;
import conversorDivisas.OpcionesConversion;
import ConversorTemperatura.OpcionesConversionTemp;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesConversionTemp tempConversion = new OpcionesConversionTemp();
		
		int bandera = 1;
		
		while(bandera == 1) {
			String opciones = JOptionPane.showInputDialog(null, 
					"Seleccione una Opción de Conversión",
					"Menú",
					JOptionPane.PLAIN_MESSAGE,
					null,
					new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Elegir").toString();
			
			switch(opciones) {
				case "Conversor de Moneda":{
					String input = JOptionPane.showInputDialog(null, "Ingrese un Valor");
					double valorRecibido = Double.parseDouble(input);
					conversion.ConvertirMonedas(valorRecibido);
					
					int resp = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversión");
					if(JOptionPane.OK_OPTION == resp) {
						System.out.println("Selecciona Continuar");
					}else {
						JOptionPane.showMessageDialog(null, "Programa Finalizado!!!!");
						bandera = 0;
					}					
					break;
				}
				case "Conversor de Temperatura":{
                    String input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir");
                    double valorRecibido = Double.parseDouble(input);
                    tempConversion.ConvertirTemperatura(valorRecibido);
					
					int resp = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversión");
					if(JOptionPane.OK_OPTION == resp) {
						System.out.println("Selecciona Continuar");
					}else {
						JOptionPane.showMessageDialog(null, "Programa Finalizado!!!!");
						bandera = 0;
					}					
					break;
				}
			}
		}
	}
}
