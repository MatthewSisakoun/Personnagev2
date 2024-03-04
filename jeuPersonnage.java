import Personnage.*;
import java.util.Random;
import java.util.Scanner;

public class jeuPersonnage{
    public static void main(String args[]) {
        //Demande des noms des personnages//
        System.out.println("Veuillez saisir le nom du sorcier : ");
        Scanner scan = new Scanner(System.in);
        String nomSorcier = scan.nextLine();
        System.out.println("Veuillez saisir votre nom : ");
        String nomGladiateur = scan.nextLine();
        System.out.println("");

        //Ajout des personnages avec leur vie//
       Personnage UnSorcier = new Personnage(nomSorcier,((int) (Math.random() * ((100 - 75)) + 75)));
       Personnage UnGladiateur = new Personnage(nomGladiateur, ((int) (Math.random() * ((125 - 75))+ 75)));

        //Print des noms et de la vie//
       System.out.println("Le nom du sorcier = " + UnSorcier.LeNom());
       System.out.println("La vie du sorcier est de " + UnSorcier.LaVie());
       System.out.println("");
       System.out.println("Votre nom est = " + UnGladiateur.LeNom());
       System.out.println("Votre vie est de " + UnGladiateur.LaVie());
       System.out.println("");

       int choixoper;

       do {
        Scanner saisie = new Scanner(System.in);
        System.out.println("Veuillez choisir votre action : \n" +
                            "1 - Attaquer \n" +
                            "2 - Se soigner \n" +
                            "3 - Ne rien faire \n" +
                            "");
            choixoper = saisie.nextInt();
        if (choixoper > 0 && choixoper < 4) {
            if (choixoper == 1) {
                UnGladiateur.Attaque(UnSorcier,((int) (Math.random() * ((40 - 15)) + 15)));
                System.out.println("Vous attaquez " + UnSorcier.LeNom() + " ...");
                System.out.println("");
                System.out.println("La vie de " + UnSorcier.LeNom() + " est maintenant de " + UnSorcier.LaVie());
                System.out.println("Votre vie est maintenant de " + UnGladiateur.LaVie());
                System.out.println("");
            }
            else if (choixoper == 2) {
                UnGladiateur.Potion();
                System.out.println("Vous avez consommé une potion et votre vie est maintenant de " + UnGladiateur.LaVie());
                System.out.println("La vie de " + UnSorcier.LeNom() + " est de " + UnSorcier.LaVie());
            }
            else if (choixoper == 3) {
                System.out.println("Vous avez décidé de vous laisser vous faire frapper par le sorcier.. Ce n'est pas très judicieux de votre part.");
            }
        }
        UnSorcier.Attaque(UnGladiateur,((int) (Math.random() * ((40 - 15)) + 15)));
            System.out.println("");
            System.out.println(UnSorcier.LeNom() +" vous attaque ...");
            System.out.println("");
            System.out.println("La vie de " + UnSorcier.LeNom() + " sorcier est de " + UnSorcier.LaVie());
            System.out.println("Votre vie est maintenant de " + UnGladiateur.LaVie());
            System.out.println("");
       }while(UnSorcier.LaVie() > 0 && UnGladiateur.LaVie() > 0 );


    //     //Utilisation d'une potion//
    //    System.out.println("Le sorcier prend une potion");
    //    UnSorcier.Potion();
    //    System.out.println("La vie du du sorcier est maintenant de " + UnSorcier.LaVie());
    //    System.out.println("");

    //     //Attaque d'un objet sur un autre//
    //    System.out.println("Le gladiateur attaque le sorcier ...");
    //    System.out.println("...");
    //    System.out.println("...");
    //    System.out.println(""); 
    //    UnGladiateur.Attaque(UnSorcier,((int) (Math.random() * ((40 - 15)))));
       
    //    //Print de la vie finale//
    //    System.out.println("Finalement, la vie du gladiateur est " + UnGladiateur.LaVie());
    //    System.out.println("Finalement, la vie du sorcier est " + UnSorcier.LaVie());

       //Détermination du gagnant//
       if (UnGladiateur.LaVie() > UnSorcier.LaVie()) {
        System.out.println("Vous êtes le gagnant, " + UnGladiateur.LeNom()) ; 
       }
       else {
        System.out.println("Le gagnant est " + UnSorcier.LeNom());
       }
	}
}