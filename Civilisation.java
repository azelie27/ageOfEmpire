import java.util.ArrayList;


class Civilisation  {

    
    private String name;
    private ArrayList <Tribus> tribu;
    private ArrayList <Unites> units;

    public Civilisation(String name, ArrayList<Tribus> tribu, ArrayList<Unites> units) {
        this.name = name;
        this.tribu = tribu;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Tribus> getTribu() {
        return tribu;
    }

    public void setTribu(ArrayList<Tribus> tribu) {
        this.tribu = tribu;
    }

    public ArrayList<Unites> getUnits() {
        return units;
    }

    public void setUnits(ArrayList<Unites> units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Civilisation [name=" + name + ", tribu=" + tribu + ", units=" + units + "]";
    }

    
    
  
    

    


    
   
}