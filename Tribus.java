class Tribus {

    
    private String name;
    private Human human;

    public Tribus(String name, Human human) {
        this.name = name;
        this.human = human;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public String toString() {
        return "Tribus [human=" + human + ", name=" + name + "]";
    }

    
    

   
    

    


}