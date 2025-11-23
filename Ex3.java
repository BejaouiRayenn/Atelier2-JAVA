package edu.isgb.Tp2;

public class Ex3 {
	public static void main(String[] args) {
        int[] t = {77, 8, 0, 200, 44, 5, 11, 222, 200, 11};
        int somme = 0;
        for (int element : t) {
            somme += element;
        }
        System.out.println("La somme des éléments du tableau est : " + somme);
        int debut = 0;
        int fin = t.length - 1; 
        while (debut < fin) {
            int temp = t[debut];
            t[debut] = t[fin];
            t[fin] = temp;
            debut++; 
            fin--; 
        }
        System.out.print(" Tableau inversé : ");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]);
            if (i < t.length - 1) {
                System.out.print(" " );
            }
        }
    }
}
