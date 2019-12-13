class Univers {

   
    private String name;
    private Carte carte;

    public Univers(String name, Carte carte) {
        this.name = name;
        this.carte = carte;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Carte getCarte() {
        return carte;
    }

    public void setCarte(Carte carte) {
        this.carte = carte;
    }

    @Override
    public String toString() {
        return "Univers [carte=" + carte + ", name=" + name + "]";
    }
    
    
    
    

    
    
   
}