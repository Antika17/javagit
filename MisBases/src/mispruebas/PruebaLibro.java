package mispruebas;
import java.util.Scanner;
import mipoo.Libro;

public class PruebaLibro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//crear objetos libro
		Libro l1=new Libro("libro", "gabriel", 10,5);
		Libro l2=new Libro();
		
		//ingresar datos a objeto l2
		System.out.println("nombre del libro");
		String nombre =sc.nextLine();
		l2.setNombre(nombre);
		
		System.out.println("nombre del auto");
		String autor=sc.nextLine();
		l2.setAutor(autor);
		
		System.out.println("numero de ejemplares");
		int ejemplares=sc.nextInt();
		l2.setEjemplares(ejemplares);
		
	

		if(l2.prestamo()) {
			System.out.println("se ha prestado el libro "+l2.getNombre()+", quedan "+l2.getEjemplares()+" ejemplares para prestar" );
			}
		else {System.out.println("no hay ejemplares de "+l2.getNombre()+" para prestar");}
		
		
		if(l2.devolucion()) {
			System.out.println("se ha vuelto el libro "+l2.getNombre()+" quedan "+l2.getEjemplares()+" ejemplares disponibles para prestamo");
		}
		else {System.out.println("no habian ejemplres prestados de "+l2.getNombre());
			
		}
		
		System.out.println(l2);
		
		l1.devolucion();
		System.out.println(l1.getPrestados()+" libros prestados" );
		
		l1.prestamo();
		System.out.println(l1.getPrestados()+" libros prestados" );
		
		sc.close();
	}

}
