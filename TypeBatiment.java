

public class TypeBatiment {

    private String ferme;
    private String chateau;
    private String maison;
    private String forge;

    public TypeBatiment() {
        
    }

    public String getFerme() {
        return ferme;
    }

    public void setFerme(String ferme) {
        this.ferme = ferme;
    }

    public String getChateau() {
        return chateau;
    }

    public void setChateau(String chateau) {
        this.chateau = chateau;
    }

    public String getMaison() {
        return maison;
    }

    public void setMaison(String maison) {
        this.maison = maison;
    }

    public String getForge() {
        return forge;
    }

    public void setForge(String forge) {
        this.forge = forge;
    }

    @Override
    public String toString() {
        return "TypeBatiment [chateau=" + chateau + ", ferme=" + ferme + ", forge=" + forge + ", maison=" + maison
                + "]";
    }



    

}
