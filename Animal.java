

public class Animal {

    private String race;
    private boolean edible;
    private boolean mangeLesGens;
    private boolean tropMignon;

    public Animal(String race, boolean edible, boolean mangeLesGens, boolean tropMignon) {
        this.race = race;
        this.edible = edible;
        this.mangeLesGens = mangeLesGens;
        this.tropMignon = tropMignon;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isEdible() {
        return edible;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
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

    @Override
    public String toString() {
        return "Animal [edible=" + edible + ", mangeLesGens=" + mangeLesGens + ", race=" + race + ", tropMignon="
                + tropMignon + "]";
    }

    
    
  
    


    
    

}
