import java.io.Serializable;

class Human implements Deplacement, ActionsHumains, Serializable {

    private int pointdeVie;
    private String armure;

    public Human() {
    }

    public Human(int pointdeVie, String armure) {
        this.pointdeVie = pointdeVie;
        this.armure = armure;
    }
   
    public int getPointdeVie() {
        return pointdeVie;
    }

    public void setPointdeVie(int pointdeVie) {
        this.pointdeVie = pointdeVie;
    }

    public String getArmure() {
        return armure;
    }

    public void setArmure(String armure) {
        this.armure = armure;
    }

    // ===== interface  =====
       public void avance(int devant) {
        System.out.println("Avance d'un pas");
        pointdeVie += 1;
    }

    public void tourneDroite(double angle) {
        System.out.println("Tourne à droite " + angle + "°");
    }
  
    public void tourneGauche(double angle) {
        System.out.println("Tourne à gauche " + angle + "°");
    }

    public void attack() {
        /*
        if ((this.getClass().getName()).equals("Hunter")) {
            System.out.println("attaque avec des flèches");            
        }
        if ((this.getClass().getName()).equals("Pretre")) {
            System.out.println("attaque avec des prières");            
        }
        if ((this.getClass().getName()).equals("Villager")) {
            System.out.println("attaque à la fourche");            
        }
        if ((this.getClass().getName()).equals("Warrior")) {
            System.out.println("attaque avec une épée");            
        }
        */

    }

    public void mange() {

    }

    public void consruit() {

    }



    // ===== toString =====
    
    public String toString() {
        return "Human [pointdeVie=" + pointdeVie + ", armure=" + armure + "]";
    }

    


}