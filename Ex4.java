
package edu.isgb.Tp2;
import java.util.Scanner;

public class Ex4 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print(" saisir la première valeur : ");
	        int a = sc.nextInt();
	        System.out.print(" saisir la deuxième valeur  : ");
	        int b = sc.nextInt();
	        sc.close();
	        int max = Math.max(a, b);
	        System.out.println("La première valeur saisie est : " + a);
	        System.out.println("La deuxième valeur saisie est : " + b);
	        System.out.println("Le maximum entre " + a + " et " + b + " est : " + max);
	    }
	}
	


