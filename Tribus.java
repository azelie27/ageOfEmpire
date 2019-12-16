
import java.util.ArrayList;

class Tribus {

    
    private String name;
    private ArrayList <Human> human;

    public Tribus(String name, ArrayList<Human> human) {
        this.name = name;
        this.human = human;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Human> getHuman() {
        return human;
    }

    public void setHuman(ArrayList<Human> human) {
        this.human = human;
    }

    @Override
    public String toString() {
        return "Tribus [human=" + human + ", name=" + name + "]";
    }


}