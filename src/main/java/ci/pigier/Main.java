package ci.pigier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int nombreAleatoire = (int)(Math.random() * 100) + 1 ;
        int nombreDeviner ;
        int essais = 10  ;
        Scanner scanner = new Scanner(System.in) ;

        do {
            System.out.println("Devinez le nombre s'il vous plaît : ");
            nombreDeviner = scanner.nextInt() ;

            if (nombreDeviner > nombreAleatoire ){
                System.out.println("Plus petit");
                essais-- ;
            } else if (nombreDeviner < nombreAleatoire){
                System.out.println("Plus grand");
                essais -- ;
            }

            if ( essais == 0 ){
                break;
            }
        }
        while ( (nombreDeviner != nombreAleatoire) );

        if (essais == 0 ){
            System.out.println("Désolé vous avez epuisez vos essais.") ;
            System.out.println("Le nombre étais : " + nombreAleatoire ) ;

        } else {
            System.out.println(" Bravo vous avez gagnez !!!!") ;
        }

    }
}
