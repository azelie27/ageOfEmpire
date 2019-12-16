import java.util.ArrayList;




class Unites  {

    private String name;
    private ArrayList <Human> humans;
    private ArrayList <Building> buildings;

    public Unites(String name, ArrayList<Human> humans, ArrayList<Building> buildings) {
        this.name = name;
        this.humans = humans;
        this.buildings = buildings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Unites [buildings=" + buildings + ", humans=" + humans + ", name=" + name + "]";
    }

    
   
    


    

    
    

 

}