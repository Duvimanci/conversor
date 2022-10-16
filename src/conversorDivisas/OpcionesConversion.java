package conversorDivisas;
import javax.swing.*;

public class OpcionesConversion {
	
	ConversorDivisas monedas = new ConversorDivisas();
	
	
	public void ConvertirMonedas(double valor) {
		
		String opcion = (JOptionPane.showInputDialog(null,
				"Elije la moneda a la que deseas convertir tu dinero",
				"Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						"De Pesos a Dolar", 
						"De Pesos a Euro", 
						"De Pesos a Libra", 
						"De Pesos a Yen", 
						"De Pesos a Won Coreano", 
						"De Dolar a Pesos",
						"De Euro a Pesos",
						"De Libra a Pesos",
						"De Yen a Pesos",
						"De Won Coreano a Pesos"},
						"Seleccion")).toString();	
		
		switch(opcion) {
			case "De Pesos a Dolar":{
				monedas.ConvertirPesosADolares(valor);
				break;
				
			}
			case "De Pesos a Euro":{
				monedas.ConvertirPesosAEuros(valor);
				break;
				
			}
			case "De Pesos a Libra": {
				monedas.ConvertirPesosALibra(valor);
				break;
				
			}
			case "De Pesos a Yen":{
				monedas.ConvertirPesosAYen(valor);
				break;
				
			}
			case "De Pesos a Won Coreano": {
				monedas.ConvertirPesosAWonCoreano(valor);
				break;
				
			}
			case "De Dolar a Pesos":{
				monedas.ConvertirDolaresAPesos(valor);
				break;
				
			}
			case "De Euro a Pesos":{
				monedas.ConvertirEurosAPesos(valor);
				break;
				
			}
			case "De Libra a Pesos":{
				monedas.ConvertirLibraAPesos(valor);
				break;
				
			}
			case "De Yen a Pesos":{
				monedas.ConvertirYenAPesos(valor);
				break;
				
			}
			case "De Won Coreano a Pesos":{
				monedas.ConvertirWonCoreanoAPesos(valor);
				break;
				
			}
		}
	}
}
