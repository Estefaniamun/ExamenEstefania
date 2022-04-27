package prueba1;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, suma;
		
		System.out.println("Introduzca un numero");
		num1 = sc.nextInt();
		
		System.out.println("Introduzca otro numero");
		num2 = sc.nextInt();
		
		suma = num1 + num2;
		
		System.out.println("La suma es: " + suma);
		System.out.println("Nueva línea");
	}

}
