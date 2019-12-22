class Villager extends Human implements ActionsHumains {

  

    public void attack() {
        System.out.println("attaque à la fouche");

    }

    public void mange() {

    }

    public void construit() {

    }

    public Villager() {

    }

    

    public Villager(int pointdeVie, String armure) {
        super(pointdeVie, armure);
    }

    @Override
    public String toString() {
        return "Villager []";
    }

    public void soigne() {
       System.out.println("uses bandaids");
    }


    

    

  

 
}