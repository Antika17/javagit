package mispruebas;

import java.io.IOException;
import java.math.*;
import java.util.Scanner;

import mipoo.Empleado;

public class EmpleadoPruebas {

	final static int MAX_EMPLEADOS = 20;
	static Empleado[] empleados = new Empleado[MAX_EMPLEADOS];
	static int indice = 0;

	public static void main(String[] args) throws IOException {
		

		Scanner sc = new Scanner(System.in);
		
		String dni, nombre;
		BigDecimal sueldoBase, horaExtra;
		Integer horasExtras;
		double tipoIRPF;
		char casado; // S ó N
		int numeroHijos;
		int i;
		int N;

		do {
			System.out.print("Número de empleados? ");
			N = sc.nextInt();
		} while (N < 0 || N > MAX_EMPLEADOS);

		for (i = 1; i <= N; i++) {
			sc.nextLine(); // limpiar el intro
			System.out.println("Empleado " + i);
			System.out.print("Nif: ");
			dni = sc.nextLine();
			System.out.print("Nombre: ");
			nombre = sc.nextLine();
			System.out.print("Sueldo Base: ");
			sueldoBase = sc.nextBigDecimal();
			System.out.print("Horas extra: ");
			horasExtras = sc.nextInt();
			System.out.print("Tipo de IRPF: ");
			tipoIRPF = sc.nextDouble();
			System.out.print("Casado (S/N): ");
			casado = (char) System.in.read();
			System.out.print("Número de hijos: ");
			numeroHijos = sc.nextInt();
			System.out.println("valor hora extra: ");

			horaExtra = sc.nextBigDecimal();
			System.out.println("\n");

			Empleado e;
			e = new Empleado();
			// crear una nueva instancia de empleado

			e.setNombres(nombre);
			e.setNif(dni);
			e.setSueldoBase(sueldoBase);
			e.setHorasExtras(horasExtras);
			e.setTipoIrpf(tipoIRPF);
			e.setCasado(casado);
			e.setNumHijos(numeroHijos);
			e.setImporteHoraExt(horaExtra);

			empleados[indice] = e; // se añade el empleado al array
			indice++;

			//System.out.print(e);
		}
		

	}
	
	
		public static void mostar(){
		
			for(int i=0; i<indice; i++)
			{System.out.println(empleados[i]);		}
		
	}
}

