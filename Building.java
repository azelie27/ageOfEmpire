import java.util.ArrayList;

class Building {

   private ArrayList <Ressource> ressources;
   private TypeBatiment typeBatiment;

    public Building(ArrayList<Ressource> ressources, TypeBatiment typeBatiment) {
        this.ressources = ressources;
        this.typeBatiment = typeBatiment;
    }

    public ArrayList<Ressource> getRessources() {
        return ressources;
    }

    public void setRessources(ArrayList<Ressource> ressources) {
        this.ressources = ressources;
    }

    public TypeBatiment getTypeBatiment() {
        return typeBatiment;
    }

    public void setTypeBatiment(TypeBatiment typeBatiment) {
        this.typeBatiment = typeBatiment;
    }

    @Override
    public String toString() {
        return "Building [ressources=" + ressources + ", typeBatiment=" + typeBatiment + "]";
    }

    

   
    

}