class Warrior extends Human implements ActionsHumains {

    


    public void attack(){
        System.out.println("Hits with a sword");
    }

    public Warrior(int pointdeVie, String armure) {
        super(pointdeVie, armure);
    }

    
    public String toString() {
        return "Warrior []";
    }

    
    public void mange() {
        System.out.println("eats");
    }

    
    public void construit() {

    }

    public void soigne() {

    }

    


    

        


}