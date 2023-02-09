package mipoo;

import java.time.LocalDate;

public class Fecha {
	private int dia;
	private int mes;
	private int año;

	public Fecha() {

	}

	public Fecha(int año, int mes, int dia) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	private boolean esBsiesto() {
		return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
	}

	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, añoCorrecto;
		añoCorrecto = año > 0;
		mesCorrecto = mes >= 1 && mes <= 12;
		switch (mes) {
		case 2:
			if (esBsiesto()) {
				diaCorrecto = dia >= 1 && dia <= 28;
			} else {
				diaCorrecto = dia >= 1 && dia <= 29;
			}

			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = dia >= 1 && dia <= 30;
			break;
		default:
			diaCorrecto = dia >= 1 && dia <= 31;
		}

		return añoCorrecto && mesCorrecto && diaCorrecto;
	}

	public void diaSiguiente() {
		dia++;
		if (!fechaCorrecta()) {
			dia = 1;
			mes++;
			if (!fechaCorrecta()) {
				mes = 1;
				año++;

			}

		}
	}

//	@Override
//	public String toString() {
//		return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";

	@Override
		public String toString() {
			StringBuilder sb=new StringBuilder();
			sb.append(año);
			sb.append("-");
			if(mes<10) {
				sb.append("0");
				}
				sb.append(mes);
				sb.append("-");
			if(dia<10) {
			sb.append("0");	
			}
			sb.append(dia);
			
			
			
			
			
			return  sb.toString();
		
	}


	}



