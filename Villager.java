class Villager extends Human implements Attack {

  

    public void attack() {
        System.out.println("x");

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