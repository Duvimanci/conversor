package ConversorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesConversionTemp {

	ConversorTemp temp = new ConversorTemp();
		
	public void ConvertirTemperatura(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije una opción para convertir", 
    			"Temperatura", 
    			JOptionPane.PLAIN_MESSAGE, 
    			null,
                new Object[] {
                		"Grados Celcius a Grados Farenheit", 
                		"Grados Celcius a Kelvin", 
                		"Grados Farenheit a Grados Celcius",
                		"Kelvin a Grados Celcius",
                    	"Kelvin a Grados Farenheit"}, 
                "Seleccion")).toString();
        
        switch(opcion) {
        case "Grados Celcius a Grados Farenheit":
        	temp.ConvertirCelciusAFarenheit(Minput);
        	break;
        case "Grados Celcius a Kelvin":
            temp.ConvertirCelciusAKelvin(Minput);
            break;
        case "Grados Farenheit a Grados Celcius":
           temp.ConvertirFarenheitACelcius(Minput);
           break;
        case "Kelvin a Grados Celcius":
           temp.ConvertirKelvinACelcius(Minput);
           break;
        case "Kelvin a Grados Farenheit":
        	temp.ConvertirKelvinAFarenheit(Minput);
        	break;
        }
	}
}
