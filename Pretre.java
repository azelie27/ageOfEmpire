class Pretre extends Human implements Attack {

    
    public Pretre() {
    }

    
    public void attack(){
        System.out.println("Hits with a staff");
    }

    @Override
    public String toString() {
        return "Pretre []";
    }

    

    
}