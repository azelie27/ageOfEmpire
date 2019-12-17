class Warrior extends Human implements Attack {

    

    public Warrior() {
    }

    public Warrior(int level, int age) {
        super(level, age);
    }

    public void attack(){
        System.out.println("Hits with a sword");
    }


    @Override
    public String toString() {
        return "Warrior []";
    }

        


}