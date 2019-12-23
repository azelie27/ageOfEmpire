import java.io.*;
import java.util.LinkedList;
import java.util.ArrayList;

class Main {

    public static void main(String[]args) {
        
        Villager vill = new Villager();
        vill.attack();
        vill.tourneDroite(25.0);

        Warrior guer = new Warrior(100, "rouge");
        guer.attack();
        System.out.println(guer);

        Animal ani = new Animal();
        ani.tourneGauche(90.0);

        Villager vill2 = new Villager(0, "rose");
        System.out.println(vill2);

        LinkedList<Integer> l = new LinkedList<Integer>();
        ArrayList<Integer> m = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            vill2.avance(i);
            l.add(i);
            System.out.println(l);
            m.add(i);
        }
              
        try {
            FileOutputStream file = new FileOutputStream("action.ser");
            ObjectOutputStream oos = new ObjectOutputStream(file);
            oos.writeObject(m);
        }
        catch (IOException e) {
            System.out.println("Serialisation a échouée");  
            e.printStackTrace();
        }

        Human hum = new Human(55,"sans");
        System.out.println(hum);

    

        
        
        ArrayList<Human> h = new ArrayList<Human>();
        Unites unit = new Unites(h); // ATTENTION d'intancier le bon constructeur
                            // avec un seul parametre
        h.add(new Human(55, "sans"));
        h.add(new Human(5, "noir"));
        h.add(new Human(20, "jaune"));        
        System.out.println(unit.point(h));
        System.out.println(unit);
        
        ArrayList<Building> build = new ArrayList<Building>();
        ArrayList<Ressource> ress = new ArrayList<Ressource>();
        ArrayList<Animal> aniList = new ArrayList<Animal>();
        build.add(new Building());
        ress.add(new Ressource());
        aniList.add(new Animal());        

        Unites unit2 = new Unites(h, build, ress, aniList); 
        System.out.println(unit2);

        
        
    }
    
}