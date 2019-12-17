import java.util.ArrayList;


class Civilisation  {


    private String name = "";
    private int early = 0;      // période début
    private int late = 0;       // période fin
    private ArrayList <Tribu> tribu;

    public Civilisation(String name, int early, int late, ArrayList<Tribu> tribu) {
        this.name = name;
        this.early = early;
        this.late = late;
    }



   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getEarly() {
        return early;
    }

    public void setEarly(int early) {
        this.early = early;
    }

    public int getLate() {
        return late;
    }

    public void setLate(int late) {
        this.late = late;
    }

    public ArrayList<Tribu> getTribu() {
        return tribu;
    }

    public void setTribu(ArrayList<Tribu> tribu) {
		this.tribu = tribu;


  
    }

    @Override
    public String toString() {

        return "Civilisation [early=" + early + ", late=" + late + ", name=" + name + "]";
    }
    

    


    
    
  
    

}