
class Warrior extends Human {


    public Warrior() {
    }
    
    public Warrior(int pointdeVie, String armure) {
        super(pointdeVie, "bouclier");
    }

    // ===== toString =====
    public String toString() {
        return "objet de la " + this.getClass() +"\nWarrior [pointdeVie=" + this.getPointdeVie() 
        + ", armure=" + this.getArmure() + "]";
        }   

    // ===== surcharge interface parents =====
    public void attack() {
        System.out.println("attaque avec une épée");           
    }


}