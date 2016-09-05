////////////////////////////////////////////////////////////////////////
// Volumenberegner for  en cylinder (version 1.0)
// Lavet af Emil Høg (s152282) og Sebastian Tibor (s145918) 05.09.2016
// Gruppe 11
////////////////////////////////////////////////////////////////////////

// Vi importerer Scanner og Math klasserne
import java.util.Scanner;
import java.lang.Math;

public class Cylinderberegner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double height , radius; // Variablen bliver defineret som height og radius

		System.out.println("Indtast højde af cylinder");
		height = input.nextDouble();
		// Løkke der forhindrer indtastning af et negativt tal i height variablen
		while (height < 0){
			System.out.println("Indtast venligst et positivt tal!");
			height = input.nextDouble();
		}

		System.out.println("Indtast radius af cylinder");
		radius= input.nextDouble();
		// Løkke der forhindrer indtastning af et negativt tal i radius variablen
		while (radius < 0){
			System.out.println("Indtast venligst et positivt tal!");
			radius = input.nextDouble();
		}
		// Beregning med den matematiske formel for beregning af en cylinders rumfang
		System.out.println("Rumfanget af cylinder: " + Math.round(Math.PI * Math.pow(radius,  2) * height));
	}

}
