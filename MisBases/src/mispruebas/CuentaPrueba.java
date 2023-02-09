package mispruebas;

import mipoo.Cuenta;

public class CuentaPrueba {

	public static void main(String[] args) {
		
    Cuenta c;
    c= new Cuenta();
    
    c.setNombre("pepe");
    c.setNumeroCuenta("5656565");
    c.setSaldo(5000);
    
    System.out.println(c.getNombre());
    System.err.println(c.getNumeroCuenta());
    System.out.println(c.getSaldo());

		//private static void pl(String mensaje) {
			//System.out.println(mensaje);
	}
	

}
