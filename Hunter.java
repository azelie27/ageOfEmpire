
class Hunter extends Human {

    public Hunter() {

    }
 
    public Hunter(int pointdeVie, String armure) {
        super(pointdeVie, armure);
    }


    // ===== toString =====
    public String toString() {
        return "Hunter []";
    }

    // ===== surcharge interface parents =====    
    public void attack() {
        System.out.println("attaque avec des flèches");            
    }


    

   
  

    

}