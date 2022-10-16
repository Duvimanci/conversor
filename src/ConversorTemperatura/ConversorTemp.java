package ConversorTemperatura;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorTemp {
		
	public double ConvertirCelciusAFarenheit(double valor) {
        DecimalFormat df = new DecimalFormat("#.00");
        double farenheit = valor * 1.8 + 32;
        JOptionPane.showMessageDialog(null, valor + " Grados Celcius son " + df.format(farenheit) + " Grados Farenheit ");
        return farenheit;
    }

    public void ConvertirCelciusAKelvin(double valor) {
        DecimalFormat df = new DecimalFormat("#.00");
        double kelvin = valor + 273.15;
        JOptionPane.showMessageDialog(null, valor + " Grados Celcius son " + df.format(kelvin) + " Kelvin");
    }

    public void ConvertirFarenheitACelcius(double valor) {
        DecimalFormat df = new DecimalFormat("#.00");
        double celcius = (valor - 32) / 1.8;
        JOptionPane.showMessageDialog(null, valor + " Grados Farenheit son " + df.format(celcius) + " Celcius");
    }

    public double ConvertirKelvinACelcius(double valor) {
        DecimalFormat df = new DecimalFormat("#.00");
        double kelvinCelcius = valor - 273.15;
        JOptionPane.showMessageDialog(null, valor + " Kelvin son " + df.format(kelvinCelcius) + " Celcius");
        return kelvinCelcius;
    }

    public void ConvertirKelvinAFarenheit(double valor) {
        DecimalFormat df = new DecimalFormat("#.00");
        double kelvinFarenheit = ConvertirKelvinACelcius(valor);
        kelvinFarenheit = ConvertirCelciusAFarenheit(kelvinFarenheit);
        JOptionPane.showMessageDialog(null, valor + " Kelvin son " + df.format(kelvinFarenheit) + " Celcius");
    }
}
