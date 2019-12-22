
class Hunter extends Human implements ActionsHumains {

    
    public void attack() {

    }

    public Hunter(int pointdeVie, String armure) {
        super(pointdeVie, armure);
    }

    @Override
    public String toString() {
        return "Hunter []";
    }


    public void mange() {
        System.out.println("eats ");
    }


    


    public void construit() {
       System.out.println("builds nothing");
    }

    
    public void soigne() {
        System.out.println("uses bandaids");

    }


    

    

   
  

    

}