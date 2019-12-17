
class Warrior extends Human implements ActionsHumains {

    



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


    @Override
    public void mange() {
        // TODO Auto-generated method stub

    }

    @Override
    public void consruit() {
        // TODO Auto-generated method stub

    }

    


    


        


}