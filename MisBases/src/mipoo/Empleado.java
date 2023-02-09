package mipoo;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Empleado {
	private static BigDecimal importeHoraExt;
	private String nif;
	private String nombres;
	private BigDecimal sueldoBase;
	private Integer horasExtras;
	private double tipoIrpf;
	private char casado;
	private int numHijos;

	public Empleado(String nif, String nombres, BigDecimal sueldoBase, Integer horasExtras, double tipoIrpf,
			char casado, int numHijos) {
		super();
		this.nif = nif;
		this.nombres = nombres;
		this.sueldoBase = sueldoBase;
		this.horasExtras = horasExtras;
		this.tipoIrpf = tipoIrpf;
		this.casado = casado;
		this.numHijos = numHijos;
	}

	public Empleado(String dni) {
		// TODO Auto-generated constructor stub
	}

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public BigDecimal getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(BigDecimal sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public Integer getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(Integer horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getTipoIrpf() {
		return tipoIrpf;
	}

	public void setTipoIrpf(double tipoIrpf) {
		this.tipoIrpf = tipoIrpf;
	}

	public char getCasado() {
		return casado;
	}

	public void setCasado(char casado) {
		this.casado = casado;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	public static BigDecimal getImporteHoraExt() {
		return importeHoraExt;
	}

	public void setImporteHoraExt(BigDecimal importeHoraExt) {
		Empleado.importeHoraExt = importeHoraExt;
	}

	public BigDecimal complemento() {

		return importeHoraExt.multiply(new BigDecimal(horasExtras));

	}

	public BigDecimal sueldoBruto() {
		return sueldoBase.add(complemento());

	}

	public BigDecimal calcularRetencion() {
		if (casado == 's' || casado == 'S') {
			tipoIrpf = tipoIrpf - 2;
		}

		tipoIrpf = tipoIrpf - numHijos;

		if (tipoIrpf < 0) {
			tipoIrpf = 0;
		}

		return sueldoBruto().multiply(BigDecimal.valueOf(tipoIrpf / 100));

	}

	public BigDecimal sueldoACobrar() {
		return sueldoBruto().subtract(calcularRetencion());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nif).append(" ").append(nombres);
		sb.append("\nsueldo base: ").append(sueldoBase);
		sb.append("\nHoras extras: ").append(horasExtras);
		sb.append("\nTipo Irpf: ").append(tipoIrpf);
		sb.append("\nCasado: ").append(casado);
		sb.append("\nNumero de hijos: ").append(numHijos);
		sb.append("\nRetencion: ").append(calcularRetencion());
		sb.append("\nSueldo a cobrar: ").append(sueldoACobrar());

		return sb.toString();

	}

}
