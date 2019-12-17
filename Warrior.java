class Warrior extends Human implements Attack {

    


    public void attack(){
        System.out.println("Hits with a sword");
    }

    public Warrior(int pointdeVie, String armure) {
        super(pointdeVie, armure);
    }

    @Override
    public String toString() {
        return "Warrior []";
    }

    


    

        


}