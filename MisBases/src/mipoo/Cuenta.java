package mipoo;


//creacion de la clase Cuenta
public class Cuenta {
	
	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	
//constructor sin parametros
	public Cuenta () {}
	
//constructor con parametros	
	public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo ) {
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;		
			}
//constructor copia	
	public Cuenta (Cuenta c) {
		this(c.nombre, c.numeroCuenta, c.tipoInteres, c.saldo);
			}
//setters y getters	
  public void setNombre (String s){
	nombre=s;
}
  public void setNumeroCuenta (String s) {
	numeroCuenta=s;  
  }
  public void setTipoInteres (double n) {
	  tipoInteres=n;
  }
  public void setSaldo (double n) {
	  saldo=n;
  }
  public String getNombre() {
	  return nombre;
  }
  public String getNumeroCuenta() {
	  return numeroCuenta;
  }
  public double getTipoInteres() {
	  return tipoInteres;
  }
  public double getSaldo() {
	  return saldo;
  }
			

	
	
	

}
