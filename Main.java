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


        
    }
    
}