import java.util.Arrays;

class Carte {

    private int[][] size;
    private String name;
    private Civilisation civilisation;
    private Unites  units;

    public Carte(int[][] size, String name, Civilisation civilisation, Unites units) {
        this.size = size;
        this.name = name;
        this.civilisation = civilisation;
        this.units = units;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Civilisation getCivilisation() {
        return civilisation;
    }

    public void setCivilisation(Civilisation civilisation) {
        this.civilisation = civilisation;
    }

    public int[][] getSize() {
        return size;
    }

    public void setSize(int[][] size) {
        this.size = size;
    }

    public Unites getUnits() {
        return units;
    }

    public void setUnits(Unites units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Carte [civilisation=" + civilisation + ", name=" + name + ", size=" + Arrays.toString(size) + ", units="
                + units + "]";
    }

    
   
  
    
    
}