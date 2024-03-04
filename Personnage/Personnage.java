package Personnage;
import java.util.Random;

public class Personnage {
   private String nom;
   private int vie;

   public Personnage(String a, int b) {
      this.nom = a;
      this.vie = b;
   }
   public String LeNom() {
      return this.nom;
   }
   public int LaVie() {
      return this.vie;
   }
   public void Potion() {
      this.vie += ((int) (Math.random() * ((50 - 10)) + 10));
   }
   public void Attaque(Personnage a, int b) {
      a.vie -= b;
   }
}