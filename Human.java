class Human {

    private int pointdeVie;
    private String armure;

    public Human(int pointdeVie, String armure) {
        this.pointdeVie = pointdeVie;
        this.armure = armure;
    }

    public Human() {}

    public int getPointdeVie() {
        return pointdeVie;
    }

    public void setPointdeVie(int pointdeVie) {
        this.pointdeVie = pointdeVie;
    }

    public String getArmure() {
        return armure;
    }

    public void setArmure(String armure) {
        this.armure = armure;
    }

    @Override
    public String toString() {
        return "Human [armure=" + armure + ", pointdeVie=" + pointdeVie + "]";
    }

   

    

}