class Warrior extends Human implements Attack {

    public Warrior() {
    }


    public void attack(){
        System.out.println("Hits with a sword");
    }


    @Override
    public String toString() {
        return "Warrior []";
    }

        


}