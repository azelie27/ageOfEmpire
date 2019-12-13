class Civilisation  {

    
    private String name;
    private Tribus tribu;
    private Unites units;

    public Civilisation(String name, Tribus tribu, Unites units) {
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

    public Tribus getTribu() {
        return tribu;
    }

    public void setTribu(Tribus tribu) {
        this.tribu = tribu;
    }

    public Unites getUnits() {
        return units;
    }

    public void setUnits(Unites units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Civilisation [name=" + name + ", tribu=" + tribu + ", units=" + units + "]";
    }

    

    


    
   
}