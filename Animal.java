

public class Animal implements Deplacement {

    private String race;
    private boolean comestible;
    private boolean mangeLesGens;
    private boolean tropMignon;

    public Animal() {
        
    }

    public Animal(String race, boolean comestible, boolean mangeLesGens, boolean tropMignon) {
        this.race = race;
        this.comestible = comestible;
        this.mangeLesGens = mangeLesGens;
        this.tropMignon = tropMignon;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isComestible() {
        return comestible;
    }

    public void setComestible(boolean comestible) {
        this.comestible = comestible;
    }

    public boolean isMangeLesGens() {
        return mangeLesGens;
    }

    public void setMangeLesGens(boolean mangeLesGens) {
        this.mangeLesGens = mangeLesGens;
    }

    public boolean isTropMignon() {
        return tropMignon;
    }

    public void setTropMignon(boolean tropMignon) {
        this.tropMignon = tropMignon;
    }


    // ===== interface  =====
    public void avance(int devant) {
        System.out.println("Avance d'un pas");
    }

    public void tourneDroite(double angle) {
        System.out.println("Tourne à droite " + angle + "°");
    }
  
    public void tourneGauche(double angle) {
        System.out.println("Tourne à gauche " + angle + "°");
    }

    
    public String toString() {
        return "Animal [comestible=" + comestible + ", mangeLesGens=" + mangeLesGens + ", race=" + race + ", tropMignon="
                + tropMignon + "]";
    }

    
    
  
    


    
    

}
