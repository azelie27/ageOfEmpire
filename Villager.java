class Villager extends Human implements ActionsHumains {

  

    public void attack() {
        System.out.println("attaque à la fouche");

    }

    public void mange() {

    }

    public void consruit() {

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


    

    

  

 
}