import java.util.ArrayList;




class Unites  {

    private ArrayList <Human> humans;
    private ArrayList <Building> buildings;
    private ArrayList <Ressource> ressources;
    private ArrayList <Animal> animaux;

    public Unites(ArrayList<Human> humans, ArrayList<Building> buildings, ArrayList<Ressource> ressources,
            ArrayList<Animal> animaux) {
        this.humans = humans;
        this.buildings = buildings;
        this.ressources = ressources;
        this.animaux = animaux;
    }

    public ArrayList<Human> getHumans() {
        return humans;
    }

    public void setHumans(ArrayList<Human> humans) {
        this.humans = humans;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    public ArrayList<Ressource> getRessources() {
        return ressources;
    }

    public void setRessources(ArrayList<Ressource> ressources) {
        this.ressources = ressources;
    }

    public ArrayList<Animal> getAnimaux() {
        return animaux;
    }

    public void setAnimaux(ArrayList<Animal> animaux) {
        this.animaux = animaux;
    }

    @Override
    public String toString() {
        return "Unites [animaux=" + animaux + ", buildings=" + buildings + ", humans=" + humans + ", ressources="
                + ressources + "]";
    }

    

}