class Villager extends Human implements Attack { 

    public Villager() {
        
    }

    
    
    public void attack(){
        System.out.println("Hit with a little fork");
    }

    @Override
    public String toString() {
        return "Villager []";
    }

  

 
}