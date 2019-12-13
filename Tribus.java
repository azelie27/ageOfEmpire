class Tribus {

    private Civilisation civilisation;
    private String name;
    private Human human;

    public Tribus(Civilisation civilisation, String name, Human human) {
        this.civilisation = civilisation;
        this.name = name;
        this.human = human;
    }

    public Civilisation getCivilisation() {
        return civilisation;
    }

    public void setCivilisation(Civilisation civilisation) {
        this.civilisation = civilisation;
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
        return "Tribus [civilisation=" + civilisation + ", human=" + human + ", name=" + name + "]";
    }

   
    

    


}