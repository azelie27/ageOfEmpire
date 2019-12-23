class Pretre extends Human {

    public Pretre() {

    }    

    public Pretre(int pointdeVie, String armure) {
        super(pointdeVie, armure);
    }


    // ===== toString =====
    public String toString() {
        return "Pretre []";
    }

    // ===== surcharge interface parents =====
    public void attack() {
        System.out.println("attaque avec des prières");           
    }

    
    
    

    

    
}