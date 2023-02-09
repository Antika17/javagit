package mispruebas;
import java.util.ArrayList;
import java.util.Scanner;

import mipoo.Fecha;
import mipoo.Person;


public class PruebasPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList persona= new ArrayList();
		Scanner sc=new Scanner(System.in);

Fecha f1=new Fecha(1,3,2020);
Person p1=new Person("Angela", "Camino los hoyos", "48980", "Cali", f1);

System.out.println("ingrese");

System.out.println(p1);
	}

}
