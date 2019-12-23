
class Villager extends Human {

  
    public Villager() {

    }
  
    public Villager(int pointdeVie, String armure) {
        super(pointdeVie, "tunique");
    }


    // ===== toString =====
    public String toString() {
        return "objet de la " + this.getClass() +"\nVillager [pointdeVie=" + this.getPointdeVie() 
        + ", armure=" + this.getArmure() + "]";
    }

    // ===== surcharge interface parents =====    
    public void attack() {
        System.out.println("attaque à la fourche");            
    }

 
}


    

    

  

 

