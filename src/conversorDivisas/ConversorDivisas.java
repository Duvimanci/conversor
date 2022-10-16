package conversorDivisas;
import javax.swing.*;


public class ConversorDivisas {
	public void ConvertirPesosADolares(double valor) {
		
		double monedaDolar = valor / 146.86;
		
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes USD " + monedaDolar + " Dólares");
	}
	
	public void ConvertirPesosAEuros(double valor) {
		
		double monedaEuro = valor / 142.56;
		
		monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes " + monedaEuro + " Euros");
	}
	
	public void ConvertirPesosALibra(double valor) {
		
		double monedaLibra = valor / 159.00;
		
		monedaLibra = (double) Math.round(monedaLibra * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes " + monedaLibra + " Libras");
	}
	
	public void ConvertirPesosAYen(double valor) {
		
		double monedaDolar = valor / 1.02;
		
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes " + monedaDolar + " Yen");
	}
	
	public void ConvertirPesosAWonCoreano(double valor) {
		
		double monedaDolar = valor / 0.10;
		
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes " + monedaDolar + " Won Coreano");
	}
	
	////////////////////////////////////////////////////////////////////////
	
	
	
	public void ConvertirDolaresAPesos(double valor) {
		
		double moneda = valor * 146.86;
		
		moneda = (double) Math.round(moneda * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Pesos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		
		double moneda = valor * 142.56;
		
		moneda = (double) Math.round(moneda * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Pesos");
	}
	
	public void ConvertirLibraAPesos(double valor) {
		
		double moneda = valor * 159.00;
		
		moneda = (double) Math.round(moneda * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Pesos");
	}
	
	public void ConvertirYenAPesos(double valor) {
		
		double moneda = valor * 1.02;
		
		moneda = (double) Math.round(moneda * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Pesos");
	}
	
	public void ConvertirWonCoreanoAPesos(double valor) {
		
		double moneda = valor * 0.10;
		
		moneda = (double) Math.round(moneda * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes $ " + moneda + " Pesos");
	}
}
