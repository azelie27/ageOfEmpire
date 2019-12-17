class Type {

       private Human human;
       private Building building;

    public Type(Human human, Building building) {
        this.human = human;
        this.building = building;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return "Type [building=" + building + ", human=" + human + "]";
    }


       

}