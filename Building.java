import java.util.ArrayList;
import java.util.Arrays;

class Building {

    private ArrayList<Ressource> ressources;
    private int[][] size;

    public Building(ArrayList<Ressource> ressources, int[][] size) {
        this.ressources = ressources;
        this.size = size;
    }

    public ArrayList<Ressource> getRessources() {
        return ressources;
    }

    public void setRessources(ArrayList<Ressource> ressources) {
        this.ressources = ressources;
    }

    public int[][] getSize() {
        return size;
    }

    public void setSize(int[][] size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Building [ressources=" + ressources + ", size=" + Arrays.toString(size) + "]";
    }
   
    
   
    
  

   
    

}