package edu.isgb.Tp2;

public class Ex2 {
	public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int z;
        int total = 20;
        int q = 17;
        int diviseur = 5;
        int compteur = 12;
        z = x++ + y;
        if (compteur > 10) {
            System.out.println( "compteur est plus grand que 10");
        }
        total -= --x; 
        System.out.println(" total est :  " + total + ",  x vaut  :" + x); 
        q %= diviseur; 
        System.out.println(" q est egale :  " + q); 
        q = 17;
        q = q % diviseur; 
        System.out.println(" q est egale " + q); 
        System.out.println("calcul de la Somme : \n");
        int somme;
        x = 1;
       somme =0;
        while (x <= 10) { 
            somme += x;
            x++; 
        } 
        System.out.println("la somme est : " + somme); 
    }
}



