

public class TypeBatiment {

    
    private Ferme ferme;
    private Maison maison;
    private Chateau chateau;
    private Forge forge;

    public TypeBatiment() {
        this.ferme = ferme;
        this.maison = maison;
        this.chateau = chateau;
        this.forge = forge;
    }

    public Ferme getFerme() {
        return ferme;
    }

    public void setFerme(Ferme ferme) {
        this.ferme = ferme;
    }

    public Maison getMaison() {
        return maison;
    }

    public void setMaison(Maison maison) {
        this.maison = maison;
    }

    public Chateau getChateau() {
        return chateau;
    }

    public void setChateau(Chateau chateau) {
        this.chateau = chateau;
    }

    public Forge getForge() {
        return forge;
    }

    public void setForge(Forge forge) {
        this.forge = forge;
    }

    @Override
    public String toString() {
        return "TypeBatiment [chateau=" + chateau + ", ferme=" + ferme + ", forge=" + forge + ", maison=" + maison
                + "]";
    }

   

   
    


    

}
