package entidade;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class CalculaBigDecimal {

	private double valor;
	

	public CalculaBigDecimal(double valor) {
		this.valor = valor;
	}

	public CalculaBigDecimal() {

	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public BigDecimal calculaBigDecimal(double valor) {
		BigDecimal bd = new BigDecimal(valor);
		bd = bd.divide(BigDecimal.TEN);
		return bd;
	}

	public String formataEmMonetario() {

		DecimalFormat df = new DecimalFormat("R$ #,##0.00");
		//System.out.println(calculaBigDecimal(valor));
		return (df.format(calculaBigDecimal(valor)));

	}
}
