package Ejercicios;
import java.util.Scanner;

public class Dni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba su dni");
		int dni= sc.nextInt();
		
		System.out.println(obtenerDni(dni));
		
		
				
	}	
	

		
	
		public static char obtenerDni(int dni) {
			char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
					'L', 'C', 'K', 'E' };

			return letras[dni %23];
		}
		
	
}

