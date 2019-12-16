

public class Ressource {

    private Arbre arbre;
    private Pierre pierre;
    private Vegetaux vegetaux;
    private Metal metal;

    public Ressource(Arbre arbre, Pierre pierre, Vegetaux vegetaux, Metal metal) {
        this.arbre = arbre;
        this.pierre = pierre;
        this.vegetaux = vegetaux;
        this.metal = metal;

    }

    public Arbre getArbre() {
        return arbre;
    }

    public void setArbre(Arbre arbre) {
        this.arbre = arbre;
    }

    public Metal getMetal() {
        return metal;
    }

    public void setMetal(Metal metal) {
        this.metal = metal;
    }

    public Pierre getPierre() {
        return pierre;
    }

    public void setPierre(Pierre pierre) {
        this.pierre = pierre;
    }

    public Vegetaux getVegetaux() {
        return vegetaux;
    }

    public void setVegetaux(Vegetaux vegetaux) {
        this.vegetaux = vegetaux;
    }

    
    


}
