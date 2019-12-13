class Building {

    private String house;
    private String castle;
    private String windmill;

    public Building(String house, String castle, String windmill) {
        this.house = house;
        this.castle = castle;
        this.windmill = windmill;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCastle() {
        return castle;
    }

    public void setCastle(String castle) {
        this.castle = castle;
    }

    public String getWindmill() {
        return windmill;
    }

    public void setWindmill(String windmill) {
        this.windmill = windmill;
    }

    @Override
    public String toString() {
        return "Building [castle=" + castle + ", house=" + house + ", windmill=" + windmill + "]";
    }


    

}