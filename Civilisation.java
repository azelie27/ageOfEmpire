class Civilisation  {

    
    private String name;
    private Carte carte;

    public Civilisation(String name, Carte carte) {
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
        return "Civilisation [carte=" + carte + ", name=" + name + "]";
    }

   
    

    
   
}